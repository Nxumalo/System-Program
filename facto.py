def facto_recur(n):
	if n == 0:
		return 1
	else:
		return n * facto_recur(n-1)


def facto_trad(n):
	if n == 0:
		return 1
	else:
		result = 1
		multiplier = 1
		while multiplier <= n:
			result *= multiplier
			multiplier += 1
		return result


print("facto_trad(500) =", facto_trad(500))
print("facto_recur(500)=", facto_recur(500))
