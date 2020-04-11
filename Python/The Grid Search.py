#https://www.hackerrank.com/challenges/the-grid-search/problem

def search(pattern,grid,row,col,x,y,n,m):
    for i in range(x):
        for j in range(y):
            if row+i<n and col+j<m:
                if not pattern[i][j]==grid[row+i][col+j]:
                    return False
    return True

for _ in range(int(input())):
    n,m=[int(x) for x in input().split()]
    grid=[]
    for i in range(n):
        grid.append([int(x) for x in input()])
    x,y=[int(x) for x in input().split()]
    pattern=[]
    for i in range(x):
        pattern.append([int(x) for x in input()])
    flag=False
    for i in range(n):
        for j in range(m):
            if grid[i][j]==pattern[0][0]:
                temp=search(pattern,grid,i,j,x,y,n,m)
                if temp:
                    flag=True
                    break
    if flag:
        print("YES")
    else:
        print('NO')
