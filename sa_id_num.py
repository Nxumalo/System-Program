# Validating SA ID numbers

num = input("Please enter a South African ID number: ")
# BEWARE, num is a string, not a variable of type int!
if len(num) != 13:
		print("This is not a valid SA ID number: must have 13 digits")
else:
		if num != str(int(num)):	# converting to int and back to string. May trigger an error already.
				print("This is not a valid SA ID number: must contain digits only")
		else: # ok, here we are sure the string contains only digits...
				# beware: positions in the string as used in the question paper start from 1,
				# but we know in the string the indices start from 0

				a = int(num[0]) + int(num[2]) + int(num[4]) + int(num[6]) + int(num[8]) + int(num[10])
				# above we sum the values of the digits in the odd positions (from the viewpoint of
				# the question paper, i.e. even indices in the Python string),
				# excluding the last digit that is Z

				b = int(num[1:12:2])
				# above we first form a string by extracting all digits at even positions
				# (from the viewpoint of the question paper, which means
				# indices 1, 3, 5, 7 and 11 in the Python string num),
				# and then we transform the resulting string into an int

				# In order to calculate c, we have a bit of preliminary work to do first...
				# We first get the string corresponding to the integer (2*b):
				temp_string = str(2*b)
				# Then we must sum all its digits and store the result into c:
				c = 0
				for i in range(len(temp_string)):		# iterating over all characters,
						c = c + int(temp_string[i])		# accumulating the value of one digit at a time

				# the rest is very straightforward:
				d = a + c
				z = 10 - (d % 10)

				# finally we test if the digit at position Z (character) is the same as this z (integer)
				if num[12] == str(z):	# comparing strings. We could also write "if int(num[12]) == z".
						print("This is a valid SA ID number.")
				else:
						print("This is not a valid SA ID number.")

