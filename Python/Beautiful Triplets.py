#https://www.hackerrank.com/challenges/beautiful-triplets/problem

n,d=[int(x) for x in input().split()]
lst=[int(x) for x in input().split()]

count=0
for i in range(n):
    for j in range(i,n):
        for k in range(j,n):
            if lst[k]-lst[j]==d and lst[j]-lst[i]==d:
                print(lst[i],lst[j],lst[k])
                count+=1
print(count)
