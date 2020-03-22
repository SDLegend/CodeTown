def ksmall(lst,k):
    sortedlst=sorted(set(lst))
    if len(sortedlst)>=k:
        return sortedlst[k-1]
    else:
        return None

k=int(input())
lst=[int(x) for x in input().split()]
print(ksmall(lst,k))
