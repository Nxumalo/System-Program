def hex2dec(hex_string):
		symbols = "0123456789abcdef"	# will be used to associate values to symbols
		power_of_16 = 1
		index = len(hex_string) - 1
		number = 0
		while index >= 0:
				char = hex_string[index]	# possibly "a", "b", etc: we cannot simply convert to int
				# where does this char occur in symbols?
				index_found = 0
				while index_found < len(symbols):
						if char == symbols[index_found]:
								break
						index_found = index_found + 1
				# we land here from the "break" statement:
				# at this point the value associated to the character in variable char is index_found
				number += index_found * power_of_16
				index -= 1
				power_of_16 *= 16
		# after the while loop starting in line 6 is done, we have the final value in the variable number
		return number





# tests, outside of the function definition
print("Converting 0x67 to decimal: " + str(hex2dec("67")))
print("Converting 0xff to decimal:", hex2dec("ff"))
print("Converting 0x12be to decimal:" , hex2dec("12be"))
print("Converting 0x4321 to decimal:" , hex2dec("4321"))
