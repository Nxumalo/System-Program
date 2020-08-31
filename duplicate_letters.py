# this programs asks the user to enter a string, and then
# produces a string where all characters of the original string are repeated twice.
original_string = input("Please enter a string: ")
output_string = ""
for character in original_string:
		output_string = output_string + character + character   # concatenation operator
print(output_string)
