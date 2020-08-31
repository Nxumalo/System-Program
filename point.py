import math

class Point:
	def __init__(self, x=0, y=0):
		# this special function is the constructor for the class Point. You give it two coordinates,
		# who by default are equal to 0: if one calls Point() without arguments, a point is created
		# at position (0,0).
		self.x = x
		self.y = y
		print('''I've just created a point at coordinates ({0},{1}) :-) '''.format(x,y))

	def __str__(self):
		# this special function returns the string that will be output by the print() function
		# when called on an object of this class
		return 'Point with coordinates ({0:.2f}, {1:.2f})'.format(self.x, self.y)

	def dist_to_origin(self):
		# this returns the Euclidean distance between the point self and the origin of the system of coordinates
		return math.sqrt(self.x ** 2 + self.y ** 2)

	def dist_to(self, point2):
		# this returns the Euclidean distance between the point self and the point point2
		return math.sqrt((self.x - point2.x) ** 2 + (self.y - point2.y) ** 2)

	def move_by(self, change_x, change_y):
		self.x += change_x
		self.y += change_y

	def move_to(self, new_x, new_y):
		self.x = new_x
		self.y = new_y

	def middlepoint(point1, point2):
		# returns the middlepoint between point1 and point2
		# notice that here we don't use the name "self" but "point1":
		# same behaviour, point1 will be used as the "self" object.
		x = (point1.x + point2.x)/2
		y = (point1.y + point2.y)/2
		return Point(x,y)

#firstpoint = Point()
#secondpoint = Point(3,7)
#thirdpoint = Point(4,8)

#print(type(firstpoint))
#print(id(firstpoint))

#print('firstpoint is at distance {0:.3f} from the origin.'.format(firstpoint.dist_origin()))
#print('secondpoint is at distance {0:.3f} from the origin.'.format(secondpoint.dist_origin()))
#print('thirdpoint is at distance {0:.3f} from the origin.'.format(thirdpoint.dist_origin()))

#print('These last two points are distant of {0:.3f}.'.format(thirdpoint.dist(secondpoint)))
#print('These last two points are distant of {0:.3f}.'.format(secondpoint.dist(thirdpoint)))
#print('square root of two is {0:.5f}'.format(math.sqrt(2)))

#centre = Point.middlepoint(firstpoint, secondpoint)
#print(centre)
#thirdpoint.move(1,1)
#print(thirdpoint)
#del secondpoint
#del firstpoint

#print(id(firstpoint))

