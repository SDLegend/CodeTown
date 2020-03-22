#https://www.hackerrank.com/challenges/runningtime/problem

n=int(input())
lst=[int(x) for x in input().split()]

count=0
for i in range(n):
    for j in range(n-1):
        if lst[j]>lst[j+1]:
            lst[j],lst[j+1]=lst[j+1],lst[j]
            count+=1
print(count)
