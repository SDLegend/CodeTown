#https://www.hackerrank.com/challenges/cavity-map/problem


def solve(n,lst):
    grid=[]
    for i in lst:
        temp=[]
        for j in i:
            temp.append(j)
        grid.append(temp)
    
    for i in range(1,n-1):
        for j in range(1,n-1):
            if int(lst[i][j])>int(lst[i+1][j]) and int(lst[i][j])>int(lst[i-1][j]) and int(lst[i][j])>int(lst[i][j+1]) and int(lst[i][j])>int(lst[i][j-1]):
                grid[i][j]="X"
    return grid

n=int(input())
lst=[]
for _ in range(n):
    lst.append(input())

final=solve(n,lst)
for i in final:
    print("".join(i))
