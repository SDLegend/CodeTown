#https://www.hackerrank.com/challenges/recursive-digit-sum/problem

n,k=[int(x) for x in input().split()]
xsum=0
for i in str(n):
    xsum+=int(i)
temp=xsum*k
while len(str(temp))>1:
    lst=[x for x in str(temp)]
    tempsum=0
    for i in lst:
        tempsum+=int(i)
    temp=tempsum+0
print(temp)
