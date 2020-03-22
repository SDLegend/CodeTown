#https://www.hackerrank.com/challenges/encryption/problem

import math

stringy=input()
length=len(stringy)
m=int(math.sqrt(length))
if m**2==length:
    n=m+0
else:
    n=m+1
if m*n>=length:
    pass
else:
    m+=1
lst=[]
for i in range(m):
    lst.append(["#"]*n)


count=-1
for i in range(m):
    for j in range(n):
        count+=1
        if count<length:
            lst[i][j]=stringy[count]
        else:
            break
#print(lst)
for j in range(n):
    word=""
    for i in range(m):
        if lst[i][j]=="#":
            continue
        word+=lst[i][j]
    print(word,end=" ")
        
        




