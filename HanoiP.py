def hanoi(n,f,h,t):
	
	if n == 1:
	
		print("move disk %s to %s\n"%(f,t))
		
	else:
	
		hanoi(n - 1,f,t,h)
		print("move disk %s to %s\n"%(f,t))
		hanoi(n - 1,h,f,t)
		
hanoi(20,'A','B','C')
	