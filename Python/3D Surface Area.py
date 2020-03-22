m,n=[int(x) for x in input().split()]
grid=[]
for _ in range(m):
    grid.append([int(x) for x in input().split()])
sum=0
for i in range(m):
    for j in range(n):
        if i==0:
            if j==0:
                if i<m and j+1<n and grid[i][j+1]<grid[i][j]:
                    sum+=grid[i][j]-grid[i][j+1]
                if i+1<m and j<n and grid[i+1][j]<grid[i][j]:
                    sum+=grid[i][j]-grid[i+1][j]
                sum+=2
                sum+=2*grid[i][j]
            elif j==n-1:
                if i<m and j-1<n and grid[i][j-1]<grid[i][j]:
                    sum+=grid[i][j]-grid[i][j-1]
                if i+1<m and j<n and grid[i+1][j]<grid[i][j]:
                    sum+=grid[i][j]-grid[i+1][j]
                sum+=2
                sum+=2*grid[i][j]
            else:
                sum+=2
                sum+=grid[i][j]
                if i<m and j-1<n and grid[i][j-1]<grid[i][j]:
                    sum+=grid[i][j]-grid[i][j-1]
                if i+1<m and j<n and grid[i+1][j]<grid[i][j]:
                    sum+=grid[i][j]-grid[i+1][j]
                if i<m and j+1<n and grid[i][j+1]<grid[i][j]:
                    sum+=grid[i][j]-grid[i][j+1]
        elif i==m-1:
            if j==0:
                sum+=2
                sum+=2*grid[i][j]
                if i<m and j+1<n and grid[i][j+1]<grid[i][j]:
                    sum+=grid[i][j]-grid[i][j+1]
                if i-1<m and j<n and grid[i-1][j]<grid[i][j]:
                    sum+=grid[i][j]-grid[i-1][j]
            elif j==n-1:
                sum+=2
                sum+=2*grid[i][j]
                if i<m and j-1<n and grid[i][j-1]<grid[i][j]:
                    sum+=grid[i][j]-grid[i][j-1]
                if i-1<m and j<n and grid[i-1][j]<grid[i][j]:
                    sum+=grid[i][j]-grid[i-1][j]
            else:
                sum+=2
                sum+=grid[i][j]
                if i<m and j-1<n and grid[i][j-1]<grid[i][j]:
                    sum+=grid[i][j]-grid[i][j-1]
                if i-1<m and j<n and grid[i-1][j]<grid[i][j]:
                    sum+=grid[i][j]-grid[i-1][j]
                if i<m and j+1<n and grid[i][j+1]<grid[i][j]:
                    sum+=grid[i][j]-grid[i][j+1]
        else:
            if j==0:
                sum+=2
                sum+=grid[i][j]
                if i<m and j+1<n and grid[i][j+1]<grid[i][j]:
                    sum+=grid[i][j]-grid[i][j+1]
                if i-1<m and j<n and grid[i-1][j]<grid[i][j]:
                    sum+=grid[i][j]-grid[i-1][j]
                if i+1<m and j<n and grid[i+1][j]<grid[i][j]:
                    sum+=grid[i][j]-grid[i+1][j]
            elif j==n-1:
                sum+=2
                sum+=grid[i][j]
                if i<m and j-1<n and grid[i][j-1]<grid[i][j]:
                    sum+=grid[i][j]-grid[i][j-1]
                if i-1<m and j<n and grid[i-1][j]<grid[i][j]:
                    sum+=grid[i][j]-grid[i-1][j]
                if i+1<m and j<n and grid[i+1][j]<grid[i][j]:
                    sum+=grid[i][j]-grid[i+1][j]
            else:
                sum+=2
                if i<m and j-1<n and grid[i][j-1]<grid[i][j]:
                    sum+=grid[i][j]-grid[i][j-1]
                if i-1<m and j<n and grid[i-1][j]<grid[i][j]:
                    sum+=grid[i][j]-grid[i-1][j]
                if i+!<m and j<n and grid[i+1][j]<grid[i][j]:
                    sum+=grid[i][j]-grid[i+1][j]
                if grid[i][j+1]<grid[i][j]:
                    sum+=grid[i][j]-grid[i][j+1]
print(sum)
