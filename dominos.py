class Domino:
		def __init__(self, v1, v2):
				if type(v1) != type(5) or type(v1) != type(v2) or v1 > 6 or v2 > 6 or v1 < 0 or v2 < 0:
						print("Error: invalid value(s)")
				else:
						self.val1 = v1
						self.val2 = v2

		def __str__(self):
				return "Domino ({0},{1})".format(self.val1, self.val2)

		def is_double(self):
				return self.val1 == self.val2
			    
		def has_blank(self):
				return self.val1 == 0 or self.val2 == 0

		def is_double_blank(self):
				return self.val1 == 0 and self.val2 == 0
				# or, equivalently:
				# return self.has_blank() and self.is_double()

		def is_pluggable(self, other_dom): # other_dom is an object of class Domino
				return self.has_blank() or other_dom.has_blank() or self.val1 == other_dom.val1 or self.val2 == other_dom.val2 or self.val1 == other_dom.val2 or self.val2 == other_dom.val1
				
		def can_be_played(self, list_of_integers):
				if self.has_blank():
						return True
				already_checked = [] # list of possible connecting values already checked
				for num in list_of_integers:
						if num in already_checked: # we use the builtin search function
								continue
						if num == 0 or num == self.val1 or num == self.val2:
								return True
						already_checked.append(num)
				return False




# TESTS
domino1 = Domino(4,5)
print("domino1:", domino1)
domino2 = Domino(6,1)
print("domino2:", domino2)

print("is_pluggable?", domino1.is_pluggable(domino2))
print("domino1 can_be_played on [6,6,0]?", domino1.can_be_played([6,6,0]))
print("domino1 can_be_played on [6,6,4]?", domino1.can_be_played([6,6,4]))
print("domino1 can_be_played on [6,6,3,1]?", domino1.can_be_played([6,6,3,1]))
