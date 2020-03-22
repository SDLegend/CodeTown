import random

inp=[]
t=20
for i in range(1,t+1):
    i=random.randint(1,10000000)
    inp.append(i)
    quotient=i//5
    remainder=i%5
    if remainder==0:
        n=quotient
    else:
        n=quotient+1
    if remainder==0:
        a,d=16,9
    elif remainder==1:
        a,d=1,2
    elif remainder==2:
        a,d=2,2
    elif remainder==3:
        a,d=7,3
    elif remainder==4:
        a,d=9,6
    term=a+(n-1)*d
    print(term)
print("INPUTS:")
print(t)
for i in inp:
    print(i)
