#   Question 1

mystring = input("Enter a string of Text:")
index = 0
char = 0
new_string = ""
while index<len(mystring):
     if index % 2 !=0:
        char = mystring[index].upper()
     else:
         char = mystring[index].lower()
     new_string =new_string + char
     index = index + 1
     
print(new_string)

#  Question 2

#  student number = 3538264

#  base n = 4

#  Question 3

#  i am going to use 4 symbols which are 3 2 1 0

#  Question 4

#  The binary representation of 200 using the base of 4 is 3020

#  Question 5

#  i have chosen the letter f

#  Question 6

input_string = input("Please enter a Decimal number: ")
baseF= 4


def BaseF2Base10(input_string):
    baseF= 4
    for character in input_string:
            if int(character)>=baseF or int(character)<0:
                            print("the value you've entered is less than zero or less then base of F which is 4")
                            exit()				      
    result = 0							      
    current_power_of_n = len(str(input_string))-1					
    index_in_input_string = 0	
    while current_power_of_n >= 0:
            input_string=str(input_string)
            result+=int(input_string[index_in_input_string])*(baseF**current_power_of_n)
            index_in_input_string+=1
            current_power_of_n-=1
    return result

print("Your number writes",BaseF2Base10(input_string), "in base 10.")



#  Qurstion 7

decimal_value=input("Enter a Decimal number:")
value = int(decimal_value)
  
def BaseFbase10(value):
    baseF = ""
    while value>0:
          baseF=str(value%4)+ baseF
          value=value//4
    return value
print("The Decimal value you've enter in base F which is to the power of 4 " + str(BaseFbase10(value))) # My prefix value comes before the 0 ""

