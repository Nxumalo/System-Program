#Question 1
mylist=[4,2,3]
i=0
def swap(mylist,i):
    temp=mylist[i]
    mylist[i]=mylist[i+1]
    mylist[i+1]=temp
    return mylist
print("This is my new swapped list, " ,swap(mylist,i))
#Optional question (bonus) [By method of Contradicti]

#(Suppose the statement is True
#    - Suppose there exist the a correct pair in which the consecutiive element such that s[i] > s[i+1] and
#     the question requires the consective element to be given to as s[i] <= s[i+1] the concecutive term will contradict
#     the The statement in its True form.
#The suppostion is false due to contratdication
#Therefor the given statement is True
#There exist no wrong pair in a list that has been not been  sorted  in ascendinting order according ti the given statement of wrong pairs)
 

#Question 2

#Question 2.1
mylist=[3,2,1,4]
def scans(mylist):  
    index = int(0)
    swap=0
    for i in range(0,len(mylist)-1):
        if mylist[index]<=mylist[index+1]:
            swap=temp
        else:
            swap+=1
    index+=1
    temp=swap
    if temp != index:
        return temp
print("The number of scans of swaps the indices under scrutiny will be :" ,scans(mylist))
#Question 2.2

mylist=[3,2,1,4]
def sort(mylist):
    swap=0
    index=0
    for i in range(0,len(mylist)-1):
        temp=mylist[i]
        mylist[i]=mylist[i+1]
        mylist[i+1]=temp
        for i in range(0,len(mylist)-1):
            if mylist[index]<=mylist[index+1]:
                swap=temp
            else:
                swap+=1
        temp=swap
                 
        if temp==mylist.sort():
            temp=mylist.sort()
        return temp
print("The sorted list of the swap is : " ,sort(mylist))
    
        
        





















    


