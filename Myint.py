class MyInt:
		def __init__(self, original_object = 0):
				self.value = int(original_object)

		def __str__(self):
				return "MyInt object with value: " + str(self.value)


		# defining a function returning AN OBJECT of class MyInt being the square of the current instance
		def square(self):
				ret_obj = MyInt(self.value * self.value)
				return ret_obj
				

a = MyInt(5.2)
print(a)
b = MyInt(5)
print(b)
c = MyInt()
print(c)

d = b.square()
print("the square I calculated is:",d)

print(d == 25)

