# this program prints all numbers in [0,1000] that are divisible by 3 and by 7
number = 0
while number <= 1000:
	if number % 3 == 0:
		print(number)
	number = number + 7
print("done")
