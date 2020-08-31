class BankingOperation:

		# class variables
		creditOperations = ["cash deposit", "EFT received", "cheque deposit"]
		debitOperations = ["POS purchase", "cash withdrawal", "EFT made", "cheque paid"]

		# methods
		def __init__(self, date, op_type, amount, message = ""):
				self.date = date
				self.type = op_type
				self.amount = amount
				self.message = message
				if op_type in BankingOperation.creditOperations:
						self.sign = 1
				else:
						self.sign = -1


		def __str__(self):
				if self.sign == 1:
						sgn = "+"
				else:
						sgn = "-"

				# the tabulation character (spacer) is written "\t" in Python strings
				return "{0}\t{1}\t{2}\t\t\t{3}{4}".format(self.date, self.type, self.message, sgn, self.amount)


		def is_debit(self):
				return self.sign == -1

		def is_credit(self):
				return self.sign == 1

		def get_year(self):
				return int(self.date[:4]) # extracting "YYYY" from "YYYYMMDD"

		def get_month(self):
				return int(self.date[4:6]) # extracting "MM" from "YYYYMMDD"

		def get_day(self):
				return int(self.date[6:8]) # extracting "DD" from "YYYYMMDD", excluding possible trailing garbage, e.g. the time

		def is_electronic(self):
				return self.type[:3] == "EFT"

		def is_cheque(self):
				return self.type[:6] == "cheque"

		def is_more_recent(self, date):
				# self is an object of class BankingOperation, date is a string.
				# we first compare the two years:
				year_self = self.get_year()
				year = int(date[:4])
				if year_self > year:
						return True
				elif year_self < year:
						return False

				# at this stage we know the two dates pertain to the same year
				month_self = self.get_month()
				month = int(date[4:6])
				if month_self > month:
						return True
				elif month_self < month:
						return False

				# at this stage we know the two dates pertain to the same year, same month
				day_self = self.get_day()
				day = int(date[6:8])
				if day_self >= day: # bigger or equal because we must return True in case the two dates are the same
						return True
				else:
						return False


		def is_older_than(self, date):
				# no, we are not going to rewrite the same kind of lengthy code.
				# instead, we use the negation of is_more_recent() and consider the additional case
				# where the two dates are exactly equal
				return not self.is_more_recent(date) or self.date == date




class BankAccount():
		def __init__(self, customer_name, number, account_type, interest_rate = 0.0, balance = 0, history = []):
				self.holder = customer_name
				self.number = number
				self.type = account_type
				self.interest_rate = interest_rate
				self.balance = balance
				self.operations_history = history

		def has_negative_balance(self):
				return self.balance < 0

		def __str__(self):
				return "Account# {0}, holder {1}, balance ZAR {2:,.2f}".format(self.number, self.holder, self.balance)

		def registerOperation(self, op):
				if type(op) != BankingOperation: # one can use names of classes as type identifiers
						print("Error in registerOperation(): argument must be of class BankingOperation!")
				else:
						self.balance += op.sign * op.amount	# using the sign (value = 1 or -1) like this is convenient
						self.operations_history.append(op)

		def accruedBalance(self, months):
				if self.has_negative_balance():
						print('No interest earned on debts!')
						return self.balance
				# as one month passes, the balance on the account is multiplied by (1 + self.interest_rate).
				# so after n months, it is multiplied by (1 + self.interest_rate) ** n:
				return self.account * (1 + self.interest_rate) ** months
				# Note that the exponentiation operator '**' has priority ("precedence") over the multiplication:
				# https://docs.python.org/3/reference/expressions.html#operator-precedence

		def miniStatement(self, date_start, date_end):
				print(self)
				print("Mini statement from {0} to {1}".format(date_start, date_end))
				print('') # to leave a blank line
				print("{0}\t\t{1}\t\t{2}\t\t\t {3}".format("date", "type", "message", "amount")) # the header

				# and then we print operations in the history that fall in the range of acceptable dates:
				for op in self.operations_history:
						if op.is_more_recent(date_start) and op.is_older_than(date_end):
								print(op)







# TESTS

op1 = BankingOperation("20120804","EFT received", 234.5)
op2 = BankingOperation("20130324","EFT received", 10004.5, "salary")
op3 = BankingOperation("20120804", "POS purchase", 2000.3, "clothes")

print("op1: year {0}, month {1}, day {2}".format(op1.get_year(), op1.get_month(), op1.get_day()))
print(op1.is_older_than("20160606")) # True
print(op1.is_electronic()) # True
print(op3.is_electronic()) # False


account1 = BankAccount("Julius Malema", 45443532, "savings", 0.005, 4000000)
account2 = BankAccount("JBDE", 3282806, "savings", 0.0037)
print(account1)
print(account2)
account2.registerOperation(5) # prints the expected error message
account2.registerOperation(op1)
account2.registerOperation(op2)
account2.registerOperation(op3)
print(account2)

print('\n\n\n') # newlines
account2.miniStatement("20000101","20170101")
print('\n\n\n') # newlines
account2.miniStatement("20120101","20121231")
