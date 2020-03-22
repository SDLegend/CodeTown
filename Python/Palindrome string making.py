def dictdiff(dct2,dct1):
    for i in dct1:
        if i in dct2:
            dct2[i]-=dct1[i]
    return dct2

n=int(input())
stringy=input()
xhash=dict()
lst=[dict()]
for i in stringy:
    if i in xhash:
        xhash[i]+=1
    else:
        xhash[i]=1
    lst.append(xhash.copy())

q=int(input())
for _ in range(q):
    l,r=[int(x) for x in input().split()]
    tempdict=dictdiff(lst[r+1].copy(),lst[l].copy())
    evencount,oddcount=0,0
    for i in tempdict:
        if tempdict[i]%2==0:
            evencount+=1
        else:
            oddcount+=1
    #print(evencount,oddcount)
    if oddcount==0 or oddcount==1:
        print("YES")
    else:
        print("NO")

