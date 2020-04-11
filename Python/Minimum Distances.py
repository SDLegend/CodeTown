#https://www.hackerrank.com/contests/quarantine-day-14/challenges/minimum-distances/submissions/code/1322240234

n=int(input())
index=dict()
lst=[int(x) for x in input().split()]
flag=False
for i in range(n):
    if lst[i] in index:
        index[lst[i]].append(i)
        flag=True
    else:
        index[lst[i]]=[i]
if flag:
    mymin=1000000000
    for i in index:
        for j in range(len(index[i])-1):
            if abs(index[i][j]-index[i][j+1])<mymin:
                mymin=abs(index[i][j]-index[i][j+1])
    print(mymin)
else:
    print(-1)
