num=(input("Enter positive whole number"))
index=0
nextnum=''
great=0
index2=1

if int(num)%2==0:
    while index2<len(num) or index<len(num):
        if ((num[index])<=(num[index2]))==True:
            great=num[index]
            index+=1
            index2+=1
        else:
            great=num[index2]
        great
          
    print("This is the greatest number in your provided number", great)
else:
    print("The number you've enter is not an even Number")
    exit()
