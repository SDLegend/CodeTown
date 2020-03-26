"""
The logic is to divide the array in two parts(left side:sorted and right side:unsorted).
Take the first element of right side of array.
Put this minimum in correct place of left side of array by shifting all the elements
greater than minimum to the right by one element and put this minimum in the hole.
Note:We take the minimum in some variable(value) so that it is not lost after shifting the elements to the right.
"""
def insertionSort(lst,n):
    for i in range(1,n):
        value=lst[i]
        hole=i
        while (hole>0 and lst[hole-1]>value):
            lst[hole]=lst[hole-1]
            hole-=1
        lst[hole]=value
    return lst

lst=[1,5,2,19,12,11,10]
print(insertionSort(lst,len(lst)))
