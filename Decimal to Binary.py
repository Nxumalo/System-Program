decimal_value=input("Enter a Decimal number:")
value=int(decimal_value)
binary=""
while value>0:
    binary=str(value%2)+binary
    value=value//2
print("The binary number you've enter is",binary)
