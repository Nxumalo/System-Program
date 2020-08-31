# defining the class for train lines
class Line:
		def __init__(self, long_name, colour, train_num_prefix):
				self.long_name = long_name
				self.colour = colour
				self.train_num_prefix = train_num_prefix

		def set_stations(self, stations):
				self.stations = stations

				self.endpoints = [ stations[0], stations[len(stations)-1] ]
				self.nb_stations = len(stations)


		def get_stations(self):
				return self.stations

		def has_station(self, stn):
				for station in self.stations:
						if stn == station:
								return True
				return False
		
		def index_station(self, stn):
				# returns the index of the station in the list self.stations, -1 if stn is not found in the list
				for i in range(self.nb_stations):
					if self.stations[i] == stn:
							return i
				return -1

		def number_stops_and_direction(self, origin, destination):
				# This function returns a list of two elements:
				# (1) the number of stops (>= 0) between one station and another on the line.
				# (2) the direction (endpoint station) in which to go in order to go from station_from to station_to
				# The two arguments are instances of the class Station. It returns [-1, None] if at least one
				# of the given stations is not on the line.
				if origin == destination:
						return [0, None]
				index_orig = -1
				index_dest = -1
				num_found = 0 # to break later as soon as we have found the two stations, using only one loop
				for i in range(self.nb_stations): # preparing to loop on the list of stations on the line
						if self.stations[i] == origin:
								index_orig = i
								num_found += 1
						elif self.stations[i] == destination:
								index_dest = i
								num_found += 1
						else:
								continue # we haven't incremented num_found
						if num_found == 2:
								break
				if num_found < 2:
						return [-1, None]
				if index_orig > index_dest:
						return [ index_orig - index_dest, self.stations[0] ] # we have to go towards the "beginning" of the line
				else:
						return [ index_dest - index_orig, self.stations[-1] ] # we have to go towards the "end" of the line


class Station:
		def __init__(self, name, code, lines):
				self.name = name
				self.code = code
				self.lines = lines
				self.is_interchange = (len(self.lines) > 1)


		def is_on_line(self, line):
				# returns True if the station is on the line (given as an object of type Line).
				# moreover, checks that the line definition is consistent with that information
				found = False
				for l in self.lines:
						if l == line:
								found = True
								break
				if not found:
						return False
				else:
						if self not in line.get_stations(): # another way to test for membership of an element in a list
								print("Warning! Inconsistent situation: station {0} claims it is on line {1}, but that line fails to list it as one of its stations!".format(self.name, line.long_name))
						return True




		def find_interchange(self, line_on, line_to):
				# this method returns a Station object being an interchange station on line_on (which contains the station self), 
				# where it is possible to change to line_to.
				# If there is no such interchange, the method returns None.
				if not self.is_on_line(line_on):
						print("Error in closest_interchange: object self is not on the first line given as argument.")
						return
				if line_on == line_to:
						print("Error in closest_interchange: line_on is the same as line_to.")
						return
				for stn in line_on.stations:
						if stn == self:
								continue # this is not an interchange, but the source station
						if line_to in stn.lines:
								return stn
				print("In closest_interchange: line \"{0}\" is not reachable with one change only from station {1} using line \"{2}\".".format(line_to.long_name, self.name, line_on.long_name))


		def find_all_interchanges(self, line_on, line_to):
				# useful to find all the possible routes from one station to another,
				# this method returns a list of Station objects:
				# all the interchange stations on line_on (which contains the station self) 
				# where it is possible to change to line_to.
				# If there is no such interchange, the method returns an empty list.
				if not self.is_on_line(line_on):
						print("Error in closest_interchange: object self is not on the first line given as argument.")
						return []
				if line_on == line_to:
						print("Error in closest_interchange: line_on is the same as line_to.")
						return []
				interchanges = []
				for stn in line_on.stations:
						if stn == self:
								continue # this is not an interchange, but the source station
						if line_to in stn.lines:
								interchanges.append(stn)
				return interchanges



		# helper function to print a direct route to the screen
		def print_direct_route(self, destination, line, direction, num_stops):
				if num_stops > 1:
						plural = "s"
				else:
						plural = ""
				print("Route from {0} to {1}:".format(self.name, destination.name))
				print("From {0} to {1} on line \"{2}\", direction {3} ({4} stop{5})\n".format(self.name, destination.name, line.long_name, direction.name, num_stops, plural))


		# helper function to print a route involving one interchange
		def print_indirect_route(self, destination, line1, direction1, num_stops1, change_stn, line2, direction2, num_stops2):
				print("Route from {0} to {1}:".format(self.name, destination.name))
				if num_stops1 > 1:
						plural = "s"
				else:
						plural = ""
				print("From {0} to {1} on line \"{2}\", direction {3} ({4} stop{5})".format(self.name, change_stn.name, line1.long_name, direction1.name, num_stops1, plural))
				print("Change lines in {0} to line \"{1}\"".format(change_stn.name, line2.long_name))
				if num_stops2 > 1:
						plural = "s"
				else:
						plural = ""
				print("From {0} to {1} on line \"{2}\", direction {3} ({4} stop{5})\n".format(change_stn.name, destination.name, line2.long_name, direction2.name, num_stops2, plural))





		# to get the route from one station to another, the first solution is to get for each station (origin and destination)
		# the list of lines they are on, and try to see if there is one line common to both stations. Then we have a path involving no
		# train change. If there is no common line, we will have to change once. We try and find a suitable interchange station going from
		# the origin station by increasing distance.
		def route_to(self, destination):
				# first try and find a route with no train change: try to find a common line
				for line1 in self.lines:
						for line2 in destination.lines:
								if line1 == line2:
										# we found a direct connection, to be preferred to any other route:
										path = line1.number_stops_and_direction(self, destination)
										self.print_direct_route(destination, line1, path[1], path[0])
										return

				# at this point we know the two stations are not on the same line. We need to find an interchange
				# from the station of origin to catch a line on which the other station is:
				for line_from_self in self.lines:
						for line_where_to_go in destination.lines:
								# find a possible interchange:
								station0 = self.find_interchange(line_from_self, line_where_to_go)
								if station0 != None:
										# we have a solution involving only one change, through station0.

										# First segment:
										first_trip = line_from_self.number_stops_and_direction(self, station0)
										# Second segment:
										second_trip = line_where_to_go.number_stops_and_direction(station0, destination)

										self.print_indirect_route(destination, line_from_self, first_trip[1], first_trip[0], station0, line_where_to_go, second_trip[1], second_trip[0]) 
										return
				print("No route found between {0} and {1} involving at most one interchange.".format(self.name, destination.name))




		# Below, "best_route_to" is a reimplementation of "route_to"
		# finding the route giving the minimum number of stops.
		# We store in a local variable the list of all solutions found so far,
		# and at the end of the function we select the one giving the minimum number of stops.
		# Our list of solutions contain solutions described as:
		# [ first_line, direction, nb_stops_trip1, interchange_station, second_line, direction, nb_stops_trip2 ]
		# ([ first_line, direction, nb_stops ] in case of a direct trip)
		# and we have three additional variables that we store:
		# (1) current_index -> the next index to be populated in the list
		# (2) minimum_stops -> the number of stops in the shortest solution
		# (3) index_in_list -> the position in the list of the shortest solution
		def best_route_to(self, destination):
				solutions = []
				current_index = 0
				minimum_stops = 1000
				index_in_list = -1

				# first try and find a route with no train change: try to find a common line
				for line1 in self.lines:
						for line2 in destination.lines:
								if line1 == line2:
										# we found a direct connection:
										path = line1.number_stops_and_direction(self, destination)
										solutions.append([line1, path[1], path[0]])
										number_stops = path[0]
										if number_stops < minimum_stops: # the solution we just found is the best so far
												minimum_stops = number_stops
												index_in_list = current_index
										# we now increment the current index because we have added a solution in the list
										current_index += 1
								else:
										# the two lines are different: find all their common interchange stations
										stations0 = self.find_all_interchanges(line1, line2)
										for connecting_station in stations0: # no iteration if stations0 is empty
												first_trip = line1.number_stops_and_direction(self, connecting_station)
												second_trip = line2.number_stops_and_direction(connecting_station, destination)
												solutions.append([line1, first_trip[1], first_trip[0], connecting_station, line2, second_trip[1], second_trip[0]])
												number_stops = first_trip[0] + second_trip[0]
												if number_stops < minimum_stops: # the solution we just found is the best so far
														minimum_stops = number_stops
														index_in_list = current_index
												# we now increment the current index because we have added a solution in the list
												current_index += 1
				
				# ultimately, we return the best route (that can involve 0 or one change):
				if index_in_list == -1: # should never happen because there is always at least one solution going through Cape Town
						print("Error: no route found!")
						return

				best = solutions[index_in_list]
				print('Best ', end='') # prefix to form "Best Route to..."
				# best is a solution: this is a list of length 3 in case the best solution is a direct route,
				# or a list of length 7 in case it involves changing trains
				if len(best)==3: # no changing trains
						self.print_direct_route(destination, best[0], best[1], best[2])
				else:
						self.print_indirect_route(destination, best[0], best[1], best[2], best[3], best[4], best[5], best[6])
						# to avoid print all these individual arguments instead of "print_indirect_route(destination, best)",
						# we would have to rewrite the definition of print_indirect_route so that it takes only two arguments


