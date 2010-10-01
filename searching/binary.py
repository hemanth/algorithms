#!/bin/python
def binary_search(searchMe, key, low = 0, high = -1):
    if(high == -1): high = len(l)-1
    if low == high:
        if searchMe[low] == key: return low
        else: return -1
    mid = (low+high)//2
    if searchMe[mid] > key: return binary_search(searchMe, value, low, mid-1)
    elif searchMe[mid] < key: return binary_search(searchMe, value, mid+1, high)
    else: return mid
