l = [3,4]
try:
		print("Second element of the list", l[1])
		print("Finished")
except IndexError:
		print("You have gone too far")
except NameError:
		print("The list is not defined")

print("Now I am done in all cases")

