#Question 1



class Cell:

    int_x = 0
    int_y = 0
    status= 0
    grid=[]
    def __init__(self,world,x,y,status,edge_len):
        self.world=world  #Question 5
        self.edge_len=edge_len
        self.x = x
        self.y = y
        self.status = status
        counter=0
    def neighbours(self, x, y): #Question 6

        count = 0

        for index in [-1, 0, 1]:
            for ver in [-1, 0, 1]:
                if not index == ver == 0 and (self.grid == True or (0 <= x + index < self.edge_len and 0 <= y + ver < self.edge_len)):
                    count += self.grid[(y + ver) % self.edge_len][(x + index) % self.edge_len]

        return count

  
    def birth():
        self.status==True
    def alive():
        self.status==False

            
#Question 3
        
class World:
    edge_len = 0
    num_cell = 0
    num_alive_cells = 0
    time=0
    grid=[]
    def __init__(self,world,edge_len):
        self.world=world              #Question 5
        self.num_cell = edge_len*edge_len
        self.grid= list(range(self.num_cell))     #Question 2
        for index in range(self.num_cell):
            self.grid[index] = Cell(self,index%self.edge_len,index//self.edge_len)

    def is_cell_alive(self,cord_x,cord_y):
        if cord_x<0 or cord_x>=self.edge_len or cord_y<0 or cord_y>=self.edge_len: #Question 4
            return False
        else:
            return self.grid[cord_y*self.edge_len+cord_x].alive
   
    
    
