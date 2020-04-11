#https://codingcompetitions.withgoogle.com/codejam/round/000000000019fd27/000000000020993c

for _ in range(int(input())):
    n=int(input())
    grid=[]
    for i in range(n):
        grid.append([int(x) for x in input().split()])
    xsum=0
    row,coloumn=0,0
    for i in grid:
        if not len(set(i))==n:
            row+=1
    for j in range(n):
        col=set()
        for i in range(n):
            col.add(grid[i][j])
            if i==j:
                xsum+=grid[i][j]
        if not len(col)==n:
            coloumn+=1
    print("Case #{}:".format(_+1),xsum,row,coloumn)
