import random

##########################
## FUNCTION DEFINITIONS ##
##########################

def is_palindrome(s): # function naturally recursive, without the use of any "reverse" operation nor any syntactic trick like [::-1]
	n = len(s)
	if n <= 1:
		return True
	else:
		return s[0].lower() == s[n-1].lower() and is_palindrome(s[1:n-1])



def are_anagrams(s,q):
	if s == q:
		return True
	elif len(s) != len(q):
		return False
	else:
		list_s = list(s.lower()) # converting a string into a list of strings, each one of length one
		list_q = list(q.lower())
		list_s.sort()
		list_q.sort()
		return list_s == list_q



# now a recursive version, a bit more tricky to write but without the help of any "sort" method:

def are_anagrams_recur(s,q):
	if s == q:
		return True
	elif len(s) != len(q):
		return False
	else:
		# at this point we are sure that none of the two strings is the empty string (see tests above)
		s = s.lower()
		q = q.lower()
		ind = q.find(s[0])
		# I use the "find" method instead of the "index" imethod because the former returns -1 as the result of an unsuccessful search,
		# whereas the latter would raise an error, which is not convenient for us in terms of further processing
		if ind == -1: # this would mean that the character s[0] is nowhere to be found in string q, so the two strings cannot be anagrams
			return False
		else:
			return are_anagrams_recur(s[1:], q[:ind] + q[ind+1:]) # the second argument boils down to q without the character we have found




def produce_anagrams(s,n):
	if n == 0:
		return []
	else:
		rng = random.Random() # creates a new random number generator
		list_s = list(s) # transforms the string into a list of strings, each one being an individual character of s
		rng.shuffle(list_s) # randomly shuffles the characters of s
		# annoying: we now have to transform this list of strings back into a string. This is a task for the "join" method.
		new_string = "".join(list_s)
		# joins all the elements of the list of strings called list_s, using a separator being the given empty string "", and creates the resulting string
		return [ new_string ] + produce_anagrams(s, n-1)



################
## TESTS, ETC ##
################

print(is_palindrome('Hannah'), ': should be True')
print(is_palindrome('rotator'), ': should be True')
print(is_palindrome('rotatur'), ': should be False')

print(are_anagrams_recur("horses", "Shores"), ': should be True')
print(are_anagrams_recur("horse", "Shores"), ': should be False')

print(produce_anagrams("horse",10))
print(produce_anagrams("Mopti",5))


