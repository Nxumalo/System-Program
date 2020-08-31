seconds = int(input('Please enter a number of seconds: '))

days = seconds // (24*3600)		# number of days
remains = seconds % (24*3600)

hours = remains // 3600			# number of hours
remains = remains % 3600

minutes = remains // 60			# number of minutes

seconds = remains % 60			# number of seconds

output_message = ""
if days > 0:
	output_message = output_message + str(days) + " days, "
if hours > 0:
	output_message = output_message + str(hours) + " hours, "
if minutes > 0:
	output_message = output_message + str(minutes) + " minutes, "
if seconds > 0:
	output_message = output_message + "and " + str(seconds) + " seconds"
print(output_message)
