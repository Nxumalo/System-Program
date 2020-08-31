# this function counts the number of occurrences of "a" or "A" in a string given as its parameter.

# function definition
def count_a(string):
		counter = 0
		for character in string:
				if (character == "a") or (character == "A"):
						counter = counter + 1
		return counter

def always_five():
		return 5


# function tests (USING the function count_a)
g = count_a('teztzerazicnazedaze')
print(g)

#print(string)
print(counter)
