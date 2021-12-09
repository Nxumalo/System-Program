class Polygon:

		unit = 'cm'

		def __init__(self, edge_lengths, angles_rotate):
				self.edge_lengths = edge_lengths
				self.angles_rotate = angles_rotate
				self.num_edges = len(edge_lengths)

		def __str__(self):
				return "Shape with {0} edges, first edge has length {1}{3}, second edge has length {2}{3}".format(self.num_edges,self.edge_lengths[0],self.edge_lengths[1], Polygon.unit)


		def get_number_edges(self):
				#return len(self.edge_lengths) # correct
				return self.num_edges # correct also, without re-calculating


class RegularPolygon(Polygon):

		def __init__(self, num_edges, edge_len):
				self.num_edges = num_edges
				self.edge_lengths = list() # same as writing [] for the empty list
				self.angles_rotate = list() # same as writing [] for the empty list
				angle = 360 / num_edges
				for i in range(num_edges):
						self.edge_lengths.append(edge_len)
						self.angles_rotate.append(angle)

		# alternate (and preferred) form of writing the constructor:
		def __init__(self, num_edges, edge_len):
				list_edges = list() # same as writing [] for the empty list
				list_angles = list() # same as writing [] for the empty list
				angle = 360 / num_edges
				for i in range(num_edges):
						list_edges.append(edge_len)
						list_angles.append(angle)

				Polygon.__init__(self, list_edges, list_angles) # instantiating the object

		def __str__(self):
				return "Regular convex polygon with {0} edges: edge length {1}{2}, inner angle value: {3}".format(self.num_edges, self.edge_lengths[1], RegularPolygon.unit, 180 - self.angles_rotate[0])





class Square(RegularPolygon):

		def __init__(self, length):
				RegularPolygon.__init__(self, 4, length)

		def area(self):
				return self.edge_lengths[0] ** 2

		def __str__(self):
				return "Square with edge length {0}, area {1}".format(self.edge_lengths[0], self.area())


mysquare = Polygon([10,10,10,10],[90,90,90,90])
print(mysquare)

square2 = RegularPolygon(4,30)
print(square2) # made a call to the __str__ method defined in the base class Polygon
#print(square2.__str__()) # exactly equivalent to line above
print(square2.area())

square3 = Square(20)
print(square3)

print("square2 has {} edges".format(square2.get_number_edges()))
