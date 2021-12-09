decimal_value=input("Enter a Decimal number:")
value=int(decimal_value)
binary=""
while value>0:
    binary=str(value//10)+(binary)
    value= int(binary)
print("The binary number you've enter is",binary)
