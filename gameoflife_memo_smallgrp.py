class Cell:
		world = None
		x = 0
		y = 0
		alive = False # alive == True means the cell is alive, otherwise the cell is dead

		def __init__(self, world_I_live_in, x_coord = 0, y_coord = 5, life_status = False):
				self.x = x_coord
				self.y = y_coord
				self.alive = life_status
				self.world = world_I_live_in

		def birth(self):
				self.alive = True

		def death(self):
				self.alive = False

		def get_number_live_neighbours(self):
				accu = 0 # accumulator for the number of live neighbours
				
				# test the left neighbour:
				if world.is_cell_alive(self.x - 1, self.y):
						accu += 1

				# test the right neighbour:
				if world.is_cell_alive(self.x + 1, self.y):
						accu += 1

				# test the row below:
				for i in [-1,0,1]:
						if world.is_cell_alive(self.x + i, self.y - 1):
								accu += 1

				# test the row above:
				for i in [-1,0,1]:
						if world.is_cell_alive(self.x + i, self.y + 1):
								accu += 1

				return accu



class World:
		def __init__(self, edge_len):
				self.edge_len = edge_len
				self.nb_cells = edge_len ** 2
				self.nb_live_cells = 0
				self.time = 0

				self.grid = []
				for i in range(self.nb_cells):
						self.grid.append(Cell(world_I_live_in = self, x_coord = i % edge_len, y_coord = i // edge_len))
				print("I have successfully created a world with {} cells.".format(self.nb_cells))
				

		def is_cell_alive(self, coord_x, coord_y):
				if coord_x < 0 or coord_x >= self.edge_len or coord_y < 0 or coord_y >= self.edge_len: 
						return False
				else:
						list_index = self.edge_len * coord_y + coord_x 
						return self.grid[list_index].alive


# outside of any class: tests
#cell0 = Cell(x_coord = 5) # cell0.alive will have value False, as the default value
#cell0.birth()

myworld = World(20)
myworld.grid[210].birth()
myworld.nb_live_cells += 1
print(myworld.is_cell_alive(10,10))

