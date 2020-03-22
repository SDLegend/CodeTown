#https://www.hackerrank.com/challenges/weighted-uniform-string/problem

stringy=input()

last=""
count=0
values=set()
for i in stringy:
    if i==last:
        values.add((count+1)*(ord(i)-96))
        count+=1
    else:
        count=1
        last=i+""
        values.add(ord(i)-96)
#print(values)

for _ in range(int(input())):
    n=int(input())
    if n in values:
        print("Yes")
    else:
        print("No")
