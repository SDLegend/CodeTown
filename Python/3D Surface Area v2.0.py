m,n=[int(x) for x in input().split()]
grid=[]
for _ in range(m):
    grid.append([int(x) for x in input().split()])
sum=0
for i in range(m):
    for j in range(n):
        sum+=2
        print("Sum incremented to:",sum)
        if i<m and j+1<n:
            if grid[i][j+1]<grid[i][j]:
                sum+=grid[i][j]-grid[i][j+1]
                print("Sum incremented to:",sum,"IN RIGHT")
        else:
            sum+=grid[i][j]
            print("Sum incremented to:",sum,"RIGHT NOT EXISTS")
        if i<m and j-1>=0:
            if grid[i][j-1]<grid[i][j]:
                sum+=grid[i][j]-grid[i][j-1]
                print("Sum incremented to:",sum,"IN LEFT")
        else:
            sum+=grid[i][j]
            print("Sum incremented to:",sum,"LEFT NOT EXISTS")
        if i+1<m and j<n:
            if grid[i+1][j]<grid[i][j]:
                sum+=grid[i][j]-grid[i+1][j]
                print("Sum incremented to:",sum,"IN DOWN")
        else:
            sum+=grid[i][j]
            print("Sum incremented to:",sum,"DOWN NOT EXISTS")
        if i-1>=0 and j<n:
            if grid[i-1][j]<grid[i][j]:
                sum+=grid[i][j]-grid[i-1][j]
                print("Sum incremented to:",sum,"IN UP")
        else:
            sum+=grid[i][j]
            print("Sum incremented to:",sum,"UP NOT EXISTS")
        print("SUM:",sum)
print(sum)

