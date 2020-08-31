
num=input("Enter your binary number:")
position=len(num)
base=0
value=0
index=0

total=0
decimal_value=0
while index<len(num):
    
    if num[index] == "1" or num[index] == "0":
        value=num[index]
        
    else:
        print("This is an invalid Binary number",num)
        break
    index=index+1
    position=position-1
    base=2**position
    total=int(value)*int(base)
    decimal_value=decimal_value+total
    if position==0:
        print("This is your value in decimal form",decimal_value)
        break
    



 

    


    


    
        

    
