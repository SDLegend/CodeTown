n=int(input())
stringy=input()
for _ in range(int(input())):
    l,r=[int(x) for x in input().split()]
    xhash=dict()
    for i in stringy[l:r+1]:
        if i in xhash:
            xhash[i]+=1
        else:
            xhash[i]=1
    evencount,oddcount=0,0
    for i in xhash:
        if xhash[i]%2==0:
            evencount+=1
        else:
            oddcount+=1
    if oddcount==0 or oddcount==1:
        print("YES")
    else:
        print("NO")
