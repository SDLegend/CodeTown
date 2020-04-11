#https://www.hackerrank.com/challenges/gem-stones/problem

n=int(input())
lst=[]
for i in range(n):
    lst.append(input())
frequency=dict()
for i in lst:
    for j in set(list(i)):
        if j in frequency:
            frequency[j]+=1
        else:
            frequency[j]=1
count=0
for i in frequency:
    if frequency[i]==n:
        count+=1
print(count)
