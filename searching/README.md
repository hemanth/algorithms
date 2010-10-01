##Pesudocodes of the Alogrithms :

#Binary search O(log n)
		
##Recursive 
		BinarySearch(A[0..N-1], value, low, high) {
			if (high < low)
				return not_found
			mid = (low + high) / 2
			if (A[mid] > value)
				return BinarySearch(A, value, low, mid-1)
			else if (A[mid] < value)
				return BinarySearch(A, value, mid+1, high)
			else
				return mid
		}


