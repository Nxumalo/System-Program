class Human:
		def __init__(self, name, gender, yob):
				self.name = name
				self.gender = gender # False means "male", True means "female"
				self.yob = yob
				self.young = (yob > 1986)


		def __str__(self):
				if self.gender:
						gender_str = "female"
				else:
						gender_str = "male"
				return "{1}: {0} born in {2}".format(gender_str, self.name, self.yob)

		def get_age(self, current_year):
				return current_year - self.yob



class Student(Human):
		def __init__(self, name, gender, yob, stu_num = 0, univ = 'UWC'):
				# most usually, the constructor of the derived class first makes a call to the constructor
				# of the base class, and then populates the additional attributes of the derived class
				Human.__init__(self, name, gender, yob)
				self.stu_num = stu_num
				self.univ = univ

		def get_age(self, current_year):
				return "student forever"





myself = Human("JB", False, 1982)
print(myself)


you = Student("Joshua", False, 1990)
helen = Student("Helen", True, 1994, 45353212, "UCT")


print(you)
print(helen)
print(helen.get_age(2016))# calling the method from the class Student

# it is still possible to force the call to a method of the base class, specifying it clearly:
print(Human.get_age(helen,2016))
