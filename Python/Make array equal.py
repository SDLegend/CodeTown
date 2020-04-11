#https://www.hackerrank.com/contests/quarantine-day-14/challenges/make-array-equal-1/submissions/code/1322239500

n=int(input())
lst=[int(x) for x in input().split()]
frequency=dict()
for i in lst:
    if i in frequency:
        frequency[i]+=1
    else:
        frequency[i]=1
mymax=0
for i in frequency:
    if frequency[i]>mymax:
        mymax=frequency[i]
print(n-mymax)        
