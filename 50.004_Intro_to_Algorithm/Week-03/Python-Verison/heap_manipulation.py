#!/usr/bin/python

a = [1, 4, 5, 7, 2, 3, 9, 8, 6]

def max_heapify(a, i):
	length = len(a)
	if (i < 0 or i > length - 1):
		return -1
		
	largest = a[i]
	if (i - 1 >= 0 and i + 1 <= length - 1):
		
		temp = 0
		larger_status = 0; 
		# -1 means left child largest
		# 0 means parent node largest
		# 1 means right node largest
		
		if (a[i-1] > a[i]):
			larger_status = -1
		elif (a[i+1] > a[i]):
			larger_status = 1
		else:
			larger_status = 0
			
		if (larger_status == -1):
			temp = a[i-1]
			a[i-1] = a[i]
			a[i] = temp
		elif (larger_status == 1):
			temp = a[i+1]
			a[i+1] = a[i]
			a[i] = temp
			
	
	
def build_max_heap(a):
	size = len(a)
	
	
	
	
build_max_heap(a)

