input_string = input("Please enter a binary number in base n: ")
base=int(input("please enter the base your number is in: "))

# first we test whether the string entered is composed exclusively of zeros
for character in input_string:
            if int(character)>=base or int(character)<0:
                            print("Error: not a valid binary number! Must contain only 0 and 1 characters.")
                            exit()					# an instruction to exit the program

# we are going to accumulate in a variable all powers of n seen in the binary representation

result = 0									# the accumulator that will finally be the result
current_power_of_n = len(str(input_string))-1					# the power of two corresponding to the LSB (2^0)
index_in_input_string = 0	# the corresponding index in the string (rightmost char)

while current_power_of_n >= 0:
            input_string=str(input_string)
            result+=int(input_string[index_in_input_string])*(base**current_power_of_n)
            #print(result)
            index_in_input_string+=1
            current_power_of_n-=1

print("Your number writes", result, "in decimal format.")

#if input_string[index_in_input_string] == '1':
#				result += current_power_of_two
            # in any case (whether the current bit is 1 or 0), we have to calculate the next power of 2:
#		current_power_of_two *= 7 		# same as "current_power_of_two = current_power_of_two * 2"
#		index_in_input_string -= 1		# and then we will go to the next character (towards the left)
