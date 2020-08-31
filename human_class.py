class Human:
		name = "Viwe"
		surname = "Ndzima"
		year_of_birth = 1982
		gender = "M"
		spouse = None

		# defining the constructor method:
		def __init__(self,gn,sn,gender,year):
				self.gender = gender
				self.name = gn
				self.year_of_birth = year
				self.surname = sn
				self.spouse = None

		# altenatively, the user gives the full name in one single string:
		def __init__(self, fullname, gender):
				self.gender = gender
				index_space = 0
				while fullname[index_space] != " ":
						index_space += 1
				# at this point, we assume fullname[index_space] is a space char
				self.name = fullname[:index_space]
				self.surname = fullname[index_space+1:]
				# default values for fields not specified in the constructor:
				self.spouse = None
				self.year_of_birth = 1900

		def print_full_name(self):
				print(self.name + " " + self.surname)

		def full_name(self):
				return self.name + " " + self.surname

		def change_yob(self, new_yob):
				self.year_of_birth = new_yob

		def age(self, current_year):
				self.age = current_year - self.year_of_birth
				return self.age

		def set_gender(self, new_gender):
				self.gender = new_gender

		def print_gender(self):
				if self.gender == "M":
						print("male")
				elif self.gender == "F":
						print("female")
				else:
						print("other")

		def print_marital_status(self):
				fullname = self.full_name()
				if self.spouse == None:
						print(fullname + " is single.")
				else:
						print(fullname + " is married to " + self.spouse.full_name() + ".")

		def marry(self, spouse_object):
				self.spouse = spouse_object


# outside of the class
clara = Human("Clara Clarks Huster","F")
clara.change_yob(1979)
print("In 2016, Clara is", clara.age(2016))
#clara = Human("Clara","Smile","F",1982)
#person1 = Human()
# remember the syntax:
# from turtle import *
# turtle1 = Turtle()
# to create a turtle
#print(type(person1))
clara.print_full_name()
print(clara.surname)
clara.print_gender()
#person1.set_gender("F")
#person1.print_gender()
clara.set_gender("M")
clara.print_gender()
clara.print_marital_status()
#print(person1.print_gender)
jean = Human("Jean Ndlovu","M")
clara.marry(jean)
clara.print_marital_status()
