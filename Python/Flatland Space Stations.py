#https://www.hackerrank.com/challenges/flatland-space-stations/problem

def solve(n,m,lst):
    j=0
    mins=[]
    for i in range(n):
        l=lst[j]
        if j+1<m:
            r=lst[j+1]
        else:
            r=lst[j]
        mins.append(min([abs(i-l),abs(r-i)]))
        if i==r and j+1<m:
            j+=1
    return max(mins)
            

n,m=[int(x) for x in input().split()]
lst=[int(x) for x in input().split()]

print(solve(n,m,sorted(lst)))
