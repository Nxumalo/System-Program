input_string = input("Please enter a binary number: ")

# first we test whether the string entered is composed exclusively of zeros
for character in input_string:
		if character != '0' and character != '1':
				print("Error: not a valid binary number! Must contain only 0 and 1 characters.")
				exit()					# an instruction to exit the program

# we are going to accumulate in a variable all powers of two seen in the binary representation

result = 0									# the accumulator that will finally be the result
current_power_of_two = 1					# the power of two corresponding to the LSB (2^0)
index_in_input_string = len(input_string)-1	# the corresponding index in the string (rightmost char)

while index_in_input_string >= 0:
		if input_string[index_in_input_string] == '1':
				result += current_power_of_two
		# in any case (whether the current bit is 1 or 0), we have to calculate the next power of 2:
		current_power_of_two *= 2 		# same as "current_power_of_two = current_power_of_two * 2"
		index_in_input_string -= 1		# and then we will go to the next character (towards the left)

print("Your number writes", result, "in decimal format.")
