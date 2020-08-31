#Question 1

mystring = int(input("Enter required string: "))
num = mystring

#Question 2

mystring = str(4464)
print(mystring[3])

#Question 3
#Question 4

mystring=input("Enter Positive Whole Number:")
i = 0
prod=0
lenght= len(mystring)
max_prod=0
while i<=lenght-3: 
    prod = int(mystring[i])*int(mystring[i+1])*int(mystring[i+2])
    if prod>max_prod:
        max_prod = prod
    i+=1
print(" The following is your maxium product: ", max_prod)
