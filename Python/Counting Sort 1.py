#https://www.hackerrank.com/challenges/countingsort1/problem

def printlst(lst):
    for i in lst:
        print(i,end=" ")
    print()

n=int(input())
lst=[int(x) for x in input().split()]
count=[0]*(100)
for i in lst:
    count[i]+=1
printlst(count)
