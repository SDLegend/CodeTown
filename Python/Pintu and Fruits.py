for _ in range(int(input())):
    n,m=[int(x) for x in input().split()]
    lst=[]
    for x in range(m):
        lst.append(-1)
    fruits=[int(x) for x in input().split()]
    cost=[int(x) for x in input().split()]
    for i in range(n):
        if lst[fruits[i]-1]==-1:
            lst[fruits[i]-1]+=1
        lst[fruits[i]-1]+=cost[i]
    minimum=51*n
    print(lst)
    for i in range(m):
        if lst[i]<minimum and lst[i]>=0:
            minimum=lst[i]
    print(minimum)
