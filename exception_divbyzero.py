def print_div(a,b):
		try:
				print("{0}/{1} = {2:.2f}".format(a,b,a/b))
		except ZeroDivisionError:
				if a > 0:
						print("{0}/{1} = +Inf".format(a,b))
				elif a < 0:
						print("{0}/{1} = -Inf".format(a,b))
				else:
						print("{0}/{1} = undef".format(a,b))


				



print_div(5,6)
print_div(5,0)
print_div(-4,0)
print_div(0,0)
print_div(-4,1e-16)
try:
	print_div(a,5)
except NameError:
	print("One or both variable(s) is/are undefined")

