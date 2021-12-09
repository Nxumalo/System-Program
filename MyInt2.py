class MyInt:
		def __init__(self, arg1 = 0):
				self.value = int(arg1)

		def __str__(self):
				return "Object of class MyInt with value: " + str(self.value)

		def square(self):
				# returns an object of class MyInt containing the square of the self
				return MyInt(self.value * self.value)


		def add(self, other):
				return MyInt(self.value + other.value)

		def printit(self):
				print("Object of class MyInt with value:", self.value)

# USE CASES
a = MyInt(4)
a.printit()

a = MyInt(4.6)
a.printit()

d = MyInt()
d.printit()

b = a.square()
print(type(b))

print(a.add(b))
