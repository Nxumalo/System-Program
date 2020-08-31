#3538264

#Question 1

#The expression checks if the number contained in variable c is less than the value of 20.

#Question 2

#list

#Question 3

#index = 0

#Question 4

#functon and list

# The function will iterate over the indices of variable d.

#Question 6

#d= iterable object
#index = 0
#while index<=len(d):
    #   new_d = d[index]
    #   index+=1


#Question 7

def partial_sums_from_a_list(num):
    if num ==[]:
        return 0
    sum_even = 0
    sum_odd = 0
    for index in range(0,len(num),2):
        sum_even +=int(num[index])
    print("Sum of elements at even indices, " ,sum_even)
    for index in range(1,len(num),2):
        sum_odd +=int(num[index])
    print("Sum of elements at odd indices, " ,sum_odd)
    

num = list(input("Enter a series of numbers:"))
partial_sums_from_a_list(num)
    
#Question 8


def bell(i,j):
   if i < 0 and j < 0:
       return 0
   if i <j:
       return 0
   if i ==0 and j ==0:
       return 1
   if i >=0 and j == 0:
       return bell(i-1,i-1)
   if i>= 1 and j <=i:
       return bell(i-1,j-1) + bell(i,j-1)
print("Enter coordinates of the Bell Triangle: " , bell(10,7)) #which should give you the return value of 389946


#Question 9
def deriv(p):
    list(p)
    new_p = ""
    x=x
    for index in p:
        new_p= + new_p[index]*x**([index]-1)
        new_p=list(new_p)
        new_p=new.sort(reverse==True)
    print(new_p)
    
#Question 10
    
import turtle

def draw_square(length):
	square = turtle.Turtle()
	for i in range(4):
		square.forward(length)
		square.left(90)
		square.color(grey)












