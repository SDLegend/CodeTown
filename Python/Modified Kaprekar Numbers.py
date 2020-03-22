#https://www.hackerrank.com/challenges/kaprekar-numbers/problem

def is_kaprekar(x):
    d=len(str(x))
    xsq=x*x
    dsq=len(str(xsq))
    #print(str(xsq)[:dsq-d],str(xsq)[dsq-d:])
    if str(xsq)[:dsq-d]=="":
        l=0
    else:
        l=int(str(xsq)[:dsq-d])
    r=int(str(xsq)[dsq-d:])
    if l+r==x:
        return True
    return False
count=0
m,n=int(input()),int(input())
for i in range(m,n+1):
    if is_kaprekar(i):
        count+=1
        print(i,end=" ")
if count==0:
    print("INVALID RANGE")
