#Question 8

num_bin = input("Enter binary number:")
for num in num_bin:
    if num !="0" and num !="1":
        print("The number you've entered is not in binary form")
        exit()

num1=1
result= 0
index=len(num_bin)-1

while index>=0:
    if num_bin[index] =="1":
        result+=num1
    num1*=2
    index-=1
print('The number youve entered in decimal for is, ', result)

#Question 8.2


        
