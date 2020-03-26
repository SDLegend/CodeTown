"""
The logic is to swap one element with its next element if they are not in order.
We do this n times for all elements and array is sorted.
Note:We get the Ith maximum number after each iteration in the right side of array
We can improve this by going till the unsorted elements i.e-(n-1-i)
We can further improve by stopping if there have been no swaps in one iteration
"""
def bubbleSort(lst,n):
    for i in range(n-1):
        flag=True
        for j in range(n-1-i):
            if lst[j]>lst[j+1]:
                lst[j],lst[j+1]=lst[j+1],lst[j]
                flag=False
        if flag:
            break
    return lst

lst=[1,5,2,19,12,11,10]
print(bubbleSort(lst,len(lst)))
