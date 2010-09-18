from heapq import merge
 
def merge_sort(m):
    if len(m) <= 1:
        return m
 
    middle = len(m) / 2
    left = m[:middle]
    right = m[middle:]
 
    left = merge_sort(left)
    right = merge_sort(right)
    return list(merge(left, right))

def merge(left, right):
    result = []
 
    while left and right:
        if left[0] <= right[0]:
            result.append(left.pop(0))
        else:
            result.append(right.pop(0))
 
    if left:
        result.extend(left)
    if right:
        result.extend(right)
    return result
