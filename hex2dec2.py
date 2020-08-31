# transforming a hexadecimal string given as argument of the function
# into a decimal number

def hex2dec(hex_string):
		symbols = "0123456789abcdef"
		power_of_16 = 1
		index = len(hex_string) - 1
		number = 0
		while index >= 0:
				char = hex_string[index]
				# Question: where is that character in the string symbols?
				# the position will give us the value of the hexadecimal character
				found_at = 0
				while found_at < len(symbols):
						if char == symbols[found_at]:
								break
						found_at += 1
				# at this point, found_at contains the position of the character from
				# the user string in the string symbols
				number +=     found_at    * power_of_16
				index -= 1
				power_of_16 *= 16
		return number



# tests
print(hex2dec("b7e"))
print(hex2dec("ff"))
print(hex2dec("32"))
