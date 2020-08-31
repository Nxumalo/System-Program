# we create a list of strings containing month names:
month_names = [ "January", "February", "March", "April", "May", "June" ]

# and then another list containing numbers of days:
num_days = [ 31, 28, 31, 30, 31, 30 ]

# and then we loop on a range(0,6):
for i in range(len(num_days)):
		print("Month", i+1, "is", month_names[i], ". It contains", num_days[i], "days.")


# and then we can grow our lists by means of function calls to append():
month_names.append("July")
month_names.append("August")
num_days.append(31)
num_days.append(31)

# and re-run our loop:

for i in range(len(num_days)):
		print("Month", i+1, "is", month_names[i], ". It contains", num_days[i], "days.")

