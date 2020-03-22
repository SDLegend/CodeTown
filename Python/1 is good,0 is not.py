import random

t=1000
lst=[]
xsum=0
for i in range(t):
    n=random.randint(0,100000)
    lst.append(n)
    print(n,str(bin(n))[2:],str(bin(n))[2:].count("1"))
    xsum+=str(bin(n))[2:].count("1")
print(xsum)
print()
print(t)
for i in lst:
    print(i,end=" ")
