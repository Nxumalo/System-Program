def fibo_recur(n):
	if n < 2:
		return n
	else:
		return fibo_recur(n-1) + fibo_recur(n-2)


def fibo_trad(n):
	counter = 1
	prev = 0
	current = 1
	while counter < n:
		next = current + prev
		prev = current
		current = next
		counter += 1
	if n == 0:
		return 0
	else:
		return current


print("fibo_trad(50) = ", fibo_trad(50))
print("fibo_recur(50) = ", fibo_recur(50))
