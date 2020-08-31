# this function detects the first occurrence of the character "a", lowercase or uppercase,
# in the string given as its argument, and produces the corresponding index in the string.
# The function returns -1 in case no "a" nor any "A" can be found in the string.

# FUNCTION DEFINITIONS
def detect_a(param1):
		index = 0

		for char in param1:
				if char == "a" or char == "A":
						return index 
				else:
						index = index + 1

		return -1 


# other version
def detect_a(param1):
		for index in range(len(param1)):
				char = param1[index]
				if char == "a" or char == "A":
						return index 

		return -1 

# last version: converting first the character into lowercase, it suffices then to compare it
# to "a". On line 31, the priority of the operators reads: (param1[index]).lower()
def detect_a(param1):
		for index in range(len(param1)):
				if param1[index].lower() == "a":
						return index 

		return -1 




f = 5
f = 6



# tests on that function: FUNCTION CALLS
print(char) # error: not defined!
print(detect_a("alphabet"))
print(detect_a("I see Alma"))
print(detect_a(input("Please enter a string")))
print("f = ", f)
