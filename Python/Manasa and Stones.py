#https://www.hackerrank.com/challenges/manasa-and-stones/problem

def solve(a,b,n):
    if b<a:
        a,b=b,a
    num=a*(n-1)
    nums=set()
    nums.add(num)
    for i in range(n-1):
        nums.add(num-a+b)
        num=num-a+b
    for i in sorted(nums):
        print(i,end=" ")
    print()

for _ in range(int(input())):
    n,a,b=int(input()),int(input()),int(input())
    solve(a,b,n)

