import time
def facto(n):
		if n == 0:
				return 1

		product = 1
		for k in range(1,n+1):
				product = product * k

		return product



def facto2(n):
		if n == 0:
				return 1
		return n * facto2(n-1)



t1 = time.time()
#print("factorial(500) =", facto(500))
facto(800)
t2 = time.time()
print("time consumed by non-rec func (ms):", 1000*(t2-t1))

t1 = time.time()
#print("factorial(500), recursive func =", facto2(500))
facto2(800)
t2 = time.time()
print("time consumed by rec func (ms):", 1000*(t2-t1))
