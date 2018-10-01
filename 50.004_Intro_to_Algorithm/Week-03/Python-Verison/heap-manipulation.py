import copy
def max_heapify(heap,HeapSize,root):#在堆中做结构调整使得父节点的值大于子节点

	left = 2*root + 1
	right = left + 1
	larger = root
	if left < HeapSize and heap[larger] < heap[left]:
		larger = left
	if right < HeapSize and heap[larger] < heap[right]:
		larger = right
	if larger != root:
		heap[larger],heap[root] = heap[root],heap[larger]
		max_heapify(heap, HeapSize, larger)

def build_max_heap(heap):
	HeapSize = len(heap)
	for i in range((HeapSize -2)//2,-1,-1):
		max_heapify(heap,HeapSize,i)
		
def heap_check(heap):
	temp = heap
	build_max_heap(heap)
	if (temp == heap):
		return True
	else:
		return False

def heap_sort(heap):
	Build_MAX_Heap(heap)
	for i in range(len(heap)-1,-1,-1):
		heap[0],heap[i] = heap[i],heap[0]
		max_heapify(heap, i, 0)
	return heap
	
def heap_max_value(heap):
	return heap[0]
	
def heap_extract_max(heap):
	if len(heap) < 1:
		print("heap overflow")
		return
		
	max_value = heap[0]
	heap[0] = heap[len(heap) - 1]
	
	max_heapify(heap, len(heap) - 1, 0)
	return max_value
	
def heap_increase_key(heap, i, key):
	if key < heap[i]:
		print("new key should be larger than the previous one")
		return
	heap[i] = key
	while (i > 0 and heap[i] > heap[(int)((i-1)/2)]):
			temp = heap[i]
			heap[i] = heap[(int)((i-1)/2)]
			heap[(int)((i-1)/2)] = temp
			
			i = (int)((i-1)/2)
	
	
def heap_insert(heap, x):
	heap = heap + [0] #assume that 0 is smaller than x
	
	i = len(heap)-1
	heap_increase_key(heap, i, x)
	return heap

				
	
sa = [80, 77, 76, 50, 45, 70, 52, 30, 29, 22]


print(heap_insert(sa, 100))
print(heap_check(sa))
print(sa)
	