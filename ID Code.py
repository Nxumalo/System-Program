
num=input("Please enter a South African ID:")
index=0
A=0
B=0
C=0
D=0
Z=0
sum_A=1
odd_sumA=0
sum_B=0
concat=""
check_sum=0
last_num=0
while len(num) == 13:
          
          if sum_A<=12:
              index=num[sum_A]
              odd_sumA=odd_sumA+int(index)
              sum_A=sum_A+2
          
          else:
              A=odd_sumA
              print("THis is A",A)    
          if sum_B<=13:
   
              index=num[sum_B]
              sum_B=sum_B+2
              concat=concat+index
          else:

              B=concat
              print("This is B",B)
              

              C=2*int(B)
              print("This is C",C)
              
              D=int(A)+C
              print("THis is D",D)
              Z=10-(D%10)
              print("This is Z",Z)
              check_sum=str(Z)
              last_num=str(num[12])

              break
        
              
   












        
 
