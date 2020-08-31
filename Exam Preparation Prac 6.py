class Point:
 """ Point class represents and manipulates x,y coords. """

 def __init__(self):
     """ Create a new point at the origin """
     self.x = 4
     self.y = 5
p = Point() # Instantiate an object of type Point
q = Point() # Make a second point

print(p.x, p.y, q.x, q.y) # Each point object has its own x and y1 p = Point() # Instantiate an object of type Point
q = Point() # Make a second point

print(p.x, p.y, q.x, q.y) # Each point object has its own x and y
