# The following is an INCOMPLETE version of the solution to
# question 3 of tutorial 7.
# To complete this, you have to add:
# (1) the necessary bits of code to produce the characters repeated
# in the longest stretch
# (2) what is ti be done AFTER the for loop.

string = input("Please enter a string: ")

max_repeat_len = 0
cur_repeat_len = 0
previous_char = ""

for char in string:
		if char == previous_char:
				cur_repeat_len += 1
		else:
				if cur_repeat_len > max_repeat_len:
						max_repeat_len = cur_repeat_len
				previous_char = char
				cur_repeat_len = 1
