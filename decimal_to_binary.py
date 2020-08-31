mynum = int(input("Please enter any positive integer:\n"))
if mynum < 0:
	print("Sorry, this number is negative.")
	exit()					# an instruction to exit the program

# we first find the bigger power of two that is less than mynum:
current_power = 1 # = 2^0
while mynum >= 2 * current_power:
	current_power *= 2 		# strictly equivalent to "current_power = current_power * 2"

# at this point we know that the current power is the biggest that fits into mynum

remaining = mynum
output_string = ""			# the output string in which we are going to write the binary representation

while (current_power >= 1): # i.e. while the exponent is bigger than or equal to 0
	if(remaining >= current_power):
		output_string += "1" # string contatenation directly into output_string
		remaining -= current_power
	else:
		output_string += "0"
	current_power /= 2 # we proceed to the next (smaller) power of 2

# notice that "0" gets correctly translated into "0" due to line 7 and the while loop 
print("Your number writes", output_string, "in binary format.")
                                                                                                                                        
