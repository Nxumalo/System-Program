# this program prints all numbers in [0,1000] that are divisible by 3 and by 7
number = -7
while number <= 1000:
	number = number + 7
	if number % 3 != 0:
		continue    # this skips line number 7 and goes to the next iteration
	print(number)
print("done")
