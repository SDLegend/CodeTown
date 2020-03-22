#https://www.hackerrank.com/challenges/happy-ladybugs/problem

for _ in range(int(input())):
    n=int(input())
    stringy=input()
    setlist=dict()
    for i in stringy:
        if i in setlist:
            setlist[i]+=1
        else:
            setlist[i]=1
    flag=True
    for i in setlist:
        if i=="_":
            continue
        if setlist[i]>1:
            pass
        else:
            flag=False
    if "_" in setlist and flag:
        print("YES")
    elif flag:
        newflag=True
        for i in range(n):
            if i+1<n and stringy[i]==stringy[i+1]:
                pass
            elif i-1>=0 and stringy[i]==stringy[i-1]:
                pass
            else:
                #print("I:",i)
                newflag=False
        if newflag:
            print("YES")
        else:
            print("NO")
    else:
        print("NO")
