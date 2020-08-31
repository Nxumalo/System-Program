class Cell:
		x = 0
		y = 0
		is_alive = False

		def __init__(self, x_coord, y_coord, life_status = False):
				self.x = x_coord
				self.y = y_coord
				self.is_alive = life_status

		def birth(self):
				self.is_alive = True

		def death(self):
				self.is_alive = False


class World:
		def __init__(self, edge_len):
				self.edge_len = edge_len
				self.nb_cells = edge_len ** 2
				self.nb_live_cells = 0
				self.time = 0

				self.grid = []
				#for i in range(0, self.nb_cells):
				#		self.grid.append(Cell(x_coord = i % edge_len, y_coord = i // edge_len))
				# alternate code, shorter/simpler:
				for y in range(edge_len):
						for x in range(edge_len):
								self.grid.append(Cell(x,y, False))

				print("I have successfully created a World with {} cells.".format(len(self.grid)))


		def is_cell_alive(self, x_coord, y_coord):
				if x_coord < 0 or x_coord >= self.edge_len or y_coord < 0 or y_coord >= self.edge_len:
						return False
				else:
						list_index = self.edge_len * y_coord + x_coord
						return self.grid[list_index].is_alive

# outside of all class definitions, tests:
mycell = Cell(5,7)
cell2 = Cell(5,7, True)

myworld = World(10)
