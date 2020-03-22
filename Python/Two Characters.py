#https://www.hackerrank.com/challenges/two-characters/problem

def checkalternate(stringy,a,b):
    last,count="",0
    for i in stringy:
        if i==a and last==a:
            return 0
        elif i==b and last==b:
            return 0
        elif i==a:
            last=a
            count+=1
        elif i==b:
            last=b
            count+=1
    return count


n=int(input())
stringy=input()

consecutive=set()
distinct=set()
for i in range(n):
    distinct.add(stringy[i])
    if i==n-1:
        continue
    elif stringy[i]==stringy[i-1]:
        consecutive.add(stringy[i])


mymax=0
for i in distinct:
    for j in distinct:
        if i==j:
            continue
        temp=checkalternate(stringy,i,j)
        if temp>mymax:
            mymax=temp+0
print(mymax)
        
        
    
