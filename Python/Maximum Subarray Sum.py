#https://leetcode.com/problems/maximum-subarray/
"""
The Logic is to take get maximum sum subarray(ending on ith element).
The maximum sum possible can be decided by taking max(lst[i],xsum[-1]+lst[i])
i.e- Maximum of ith element or sum of ith element and max sum subarray till (i-1)
"""

def maxsubarraysum(lst,n):
    xsum=[lst[0]]
    for i in range(1,n):
        if xsum[-1]+lst[i]>lst[i]:
            xsum.append(xsum[-1]+lst[i])
        else:
            xsum.append(lst[i])
    print(xsum)
    return max(xsum)

lst=[int(x) for x in input().split()]
print(maxsubarraysum(lst,len(lst)))
