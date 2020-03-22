#https://codingcompetitions.withgoogle.com/kickstart/round/000000000019ffc7/00000000001d40bb
from itertools import combinations_with_replacement,permutations

for _ in range(int(input())):
    n,k,p=[int(x) for x in input().split()]
    stacks=[]
    cdf=[]
    for i in range(n):
        stacks.append([int(x) for x in input().split()])
    for i in stacks:
        tempsum=0
        temp=[]
        for j in i:
            tempsum+=j
            temp.append(tempsum)
        cdf.append(temp)
    comb = combinations_with_replacement(range(0,k+1),n)
    mymax=0
    #print(cdf)
    for i in list(comb):
        if sum(i)==p:
            for j in list(permutations(i)):
                #print(j)
                tempsum=0
                for k in range(n):
                    if j[k]>0:
                        tempsum+=cdf[k][j[k]-1]
                #print(tempsum)
                if tempsum>mymax:
                    mymax=tempsum
    print("Case #{}:".format(_+1),mymax)
    
