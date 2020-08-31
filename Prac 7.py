#Question 1

num=str(input("Enter a whole number:"))
if int(num)%2==0:
        print("The number",num, "is an even number")
else:
        print("The number", num,"is an odd number")

#Question 2

year=str(input("Please enter a number interger:"))
if int(year)%4==0:
  if int(year)%100==0:
      print("The",year,"is not a leap year")
  else:
      print("The",year,"is a leap year")
else:    
  print("The",year," not a leap year")

#Question 3

string=input("Enter a set of characters:")
vowel="aeiou"

char=0
letter=string[char]
Total=0
while len(string):
    if True:
       v==letter
       char=char+1
       vowel_v=vowel_v+1
       char==len(string)
       
    if True:
          o==letter
          char=char+1
          vowel_o=vowel_o+1
          char==len(string)
    
    if  True:
       w==letter
       char=char+1
       vowel_w=vowel_w+1
       char==len(string)
       if  True:
             e==letter
             char=char+1
             vowel_e=vowel_e+1
             char==len(string)
             if  True:
              l==letter
              char=char+1
              vowel_l=vowel_l+1
              char==len(string)
Total= Total+vowel_v+vowel_o+vowel_w+vowel_e+vowel_l

print("There are",Total,"vowels")



















       
