#https://www.hackerrank.com/challenges/closest-numbers/problem

n=int(input())
lst=[int(x) for x in input().split()]
sortedlst=sorted(lst)
difference=[]
for i in range(1,n):
    difference.append(sortedlst[i]-sortedlst[i-1])
minimum=min(difference)
#print(sortedlst)
#print(difference)
for i in range(n-1):
    if difference[i]==minimum:
        print(sortedlst[i],sortedlst[i+1],end=" ")
