#https://www.hackerrank.com/challenges/halloween-sale/problem

def solve(p,d,m,s):
    price=p
    count=0
    while s>=price:
        s-=price
        count+=1
        price-=d
        if price<=m:
            price=m
    return count
        
p,d,m,s=[int(x) for x in input().split()]

print(solve(p,d,m,s))
