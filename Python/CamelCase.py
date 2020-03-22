#https://www.hackerrank.com/challenges/camelcase/problem

stringy=input()
count=0
for i in stringy:
    if ord(i)>=65 and ord(i)<=90:
        count+=1
print(count+1)
