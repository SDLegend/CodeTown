#https://www.hackerrank.com/challenges/find-the-median/problem

n=int(input())
lst=[int(x) for x in input().split()]
lst.sort()
print(lst[n//2])

