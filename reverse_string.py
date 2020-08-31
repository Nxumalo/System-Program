# this program reverses a string that the user has entered:
# first char of the result string is the last char of the original string,
# second char of the result is last but one in the original string, etc.
original_string = input("Please enter a string: ")
output_string = ""
for character in original_string:
		output_string = character + output_string
print(output_string)
