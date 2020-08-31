import time
def fib(n):
		if n == 0:
				return 0
		else:
				prev = 0
				current = 1
				while n > 1:
						next = prev + current
						prev = current
						current = next
						n -= 1
				return current


def fib_rec(n):
		if n == 0 or n == 1:
				return n
		else:
				return fib_rec(n-1) + fib_rec(n-2)



#print(fib_rec(10))
t1 = time.time()
print(fib(40))
t2 = time.time()
print("time consumed by fib(40) in ms:",1000*(t2-t1))

t1 = time.time()
print(fib_rec(40))
t2 = time.time()
print("time consumed by fib_rec(40) in ms:",1000*(t2-t1))
#print(fib_rec(50))
#print(fib_rec(100))
#print(fib_rec(1000))
