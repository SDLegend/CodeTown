#https://www.hackerrank.com/challenges/bomber-man/problem

def printlst(lst):
    for i in lst:
        for j in i:
            print(j,end="")
        print()

def getnext(lst):
    grid=[]
    for i in range(r):
        grid.append(["O"]*c)
    bombs=[]
    for i in range(r):
        for j in range(c):
            if lst[i][j]=="O":
                bombs.append(list([i+0,j+0]))
    for i in bombs:
        grid[i[0]][i[1]]="."
        if i[0]+1<r:
            grid[i[0]+1][i[1]]="."
        if i[0]-1>=0:
            grid[i[0]-1][i[1]]="."
        if i[1]+1<c:
            grid[i[0]][i[1]+1]="."
        if i[1]-1>=0:
            grid[i[0]][i[1]-1]="."
    return grid


r,c,n=[int(x) for x in input().split()]
first=[]
for i in range(r):
    first.append([x for x in input()])

second=getnext(first)
third=getnext(second)
allo=[]
grid=[]
for i in range(r):
    allo.append(["O"]*c)

if n==1:
    printlst(first)
else:
    if (n-2)%4==0:
        #print("MOD 0")
        printlst(allo)
    elif (n-2)%4==1:
        #print("MOD 1")
        printlst(second)
    elif (n-2)%4==2:
        #print("MOD 2")
        printlst(allo)
    else:
        #print("MOD 3")
        printlst(third)
    

