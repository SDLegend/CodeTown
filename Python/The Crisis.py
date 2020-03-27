s=int(input())
n=int(input())
i=1
lst=[]
while True:
    if i**n<=s:
        lst.append(i**n)
    else:
        break
    i+=1
possible=[0]
for i in lst:
    for j in possible.copy():
        if i+j<=s:
            possible.append(i+j)
#print(possible)
print(possible.count(s)) 

