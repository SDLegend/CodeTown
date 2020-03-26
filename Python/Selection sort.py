import sys
"""
The logic is to find minimum number n times and put it in another array.
Once you find minimum of the array replace it with MaxInt after putting it in sorted array.
"""
def selectionSort(lst,n):   
    sortedlst=[0]*n
    for i in range(n):
        index=i
        mymin=lst[i]
        for j in range(n):
            if lst[j]<mymin:
                mymin=lst[j]
                index=j
        sortedlst[i]=lst[index]
        lst[index]=sys.maxsize      #Maximum size offered by machine
    return sortedlst

lst=[1,5,2,19,12,11,10]
print(selectionSort(lst,len(lst)))
