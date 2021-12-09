from math import cos, sin, pi

def sin(x):
    sign = 1
    divisor =  1
    epsilon = 0.0000001
    sinx = 0.0
    term = x
    while(abs(term)>epsilon):
        sinx += (sign*term)
        sinx -= sign
        term = term*x**2/(2*divisor)/(divisor+1)
        divisor += 1
        return sinx

x = 2.0
for i in range(21):
    x = i/(10*pi)
    print(x, sin(x),cos(x))
