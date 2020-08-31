class Polygon:

		unit = 'cm'

		def __init__(self, edge_lengths, angles_rotate):
				self.edge_lengths = edge_lengths
				self.angles_rotate = angles_rotate
				self.num_edges = len(edge_lengths)

		def __str__(self):
				return "Shape with {0} edges, first edge has length {1}{3}, second edge has length {2}{3}".format(self.num_edges,self.edge_lengths[0],self.edge_lengths[1], Polygon.unit)


		def get_number_edges(self):
				return self.num_edges

		def is_regular(self):
				edge1 = self.edge_lengths[0]
				for x in range(1, self.num_edges):
						if self.edge_lengths[x] != edge1:
								return False
				angle1 = self.angles_rotate[0]
				for x in range(1, len(self.angles_rotate)):
						if self.angle_rotate[x] != angle1:
								return False
				return True


		def get_perimeter(self):
				accu = 0
				for i in range(self.num_edges):
						accu += self.edge_lengths[i]
				return accu




class RegularPolygon(Polygon):
		def __init__(self, num_edges, edge_len):
				self.num_edges = num_edges
				self.edge_lengths = list()
				for i in range(num_edges):
						self.edge_lengths.append(edge_len)
				self.angles_rotate = []



mysquare = Polygon([10,10,10,10],[90,90,90,90])
print(mysquare)

square2 = RegularPolygon(4,30)
print(square2)

