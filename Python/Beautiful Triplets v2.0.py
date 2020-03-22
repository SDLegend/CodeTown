#https://www.hackerrank.com/challenges/beautiful-triplets/problem

n,d=[int(x) for x in input().split()]
lst=[int(x) for x in input().split()]

count=0
nums=set(lst)
for i in lst:
    if (i+d in nums) and (i-d in nums):
        temp1,temp2=lst.count(i+d),lst.count(i-d)
        count+=temp1+temp2-1
print(count)
