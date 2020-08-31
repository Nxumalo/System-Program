
#Question 2.1

string=input("Enter number:")
num=list(string)
index=0
num_string=""
number_str=""
for punt in num:
    if '-' in num:
       num.remove('-')
    
       

while index<=len(num):
    if num[0]=='0':
        new_num=num[1:len(num)]
        num_string = new_num
    else:
        new_num=num[0:len(num)]
        num_string = new_num
    index+=1
    index==(len(num))
    break
for fin in num_string:
    number_str = number_str + fin
    

print(int(number_str))


#Question 2.2

string=input("Enter contact number:")
num=list(string)
new_num="0"
for number in num:
   new_num=new_num+number
print(new_num)


#Question 3.1

name=[]
contact_name=str(input("Enter contact name:"))
list(contact)
number =[]
num_input=input("Enter contact number:")
list(num_input)
while True:
    number.append(num_input)
    





























  
 
