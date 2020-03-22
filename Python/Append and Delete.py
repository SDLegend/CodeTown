#https://www.hackerrank.com/challenges/append-and-delete/problem

initial=input()
target=input()
k=int(input())
m=len(initial)
n=len(target)

i,count=0,0
while i<m and i<n:
    if initial[i]==target[i]:
        count+=1
    else:
        break
    i+=1

steps=(m-count)+(n-count)

if k>=steps and (k-steps)%2==0:
    print("Yes")
elif k>(m+n):
    print("Yes")
else:
    print("No")