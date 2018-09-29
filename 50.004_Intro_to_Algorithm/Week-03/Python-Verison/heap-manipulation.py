
import copy

ss = [9, 19, 50, 7, 8, 10, 25, 2, 5, 17, 12, 8]


def max_heapify(array, i):
	input_len = len(array)
	tree_idx = i + 1
	
	if (tree_idx <= input_len / 2):
		
		left_child = tree_idx * 2
		right_child = tree_idx * 2 + 1
		
		if (right_child <= input_len):
			largest = tree_idx - 1
			if (array[largest] < array[left_child - 1]):
				largest = left_child - 1
				
			if (array[largest] < array[right_child - 1]):
				largest = right_child - 1
				
			if (largest != tree_idx - 1):
				temp = array[tree_idx - 1]
				array[tree_idx - 1] = array[largest]
				array[largest] = temp
				
				max_heapify(array, largest)
			
		else:
			
			largest = tree_idx - 1
			if (array[tree_idx - 1] < array[left_child - 1]):
				largest = left_child - 1
				
			if (largest != tree_idx - 1):
				temp = array[tree_idx - 1]
				array[tree_idx - 1] = array[largest]
				array[largest] = temp
				
				
def build_max_heap(array):
	start_idx = int(len(array) / 2) - 1
	
	for i in range(start_idx, -1, -1):
		max_heapify(array, i)
		
def test_heap(array):
	temp = copy.deepcopy(array)
	build_max_heap(temp)
	if (temp == array):
		return True
	else:
		return False
		
#def increase_key(array, i, new_key):
#	array[i] = key	
		
	
sa = [80, 77, 76, 50, 45, 70, 52, 30, 29, 22]

print(test_heap(sa))
	