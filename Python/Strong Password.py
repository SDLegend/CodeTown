#https://www.hackerrank.com/challenges/strong-password/problem

n=int(input())
stringy=input()
steps=0

nums=set(["1","2","3","4","5","6","7","8","9","0"])
specialchars=set(["!","@","#","$","%","^","&","*","(",")","-","+"])

numflag,spcflag,lowerflag,upperflag=False,False,False,False
for i in stringy:
    if i in nums:
        numflag=True
    if i in specialchars:
        spcflag=True
    if ord(i)>=65 and ord(i)<=90:
        upperflag=True
    if ord(i)>=97 and ord(i)<=122:
        lowerflag=True
if not numflag:
    steps+=1
if not spcflag:
    steps+=1
if not upperflag:
    steps+=1
if not lowerflag:
    steps+=1
if steps+n>=6:
    print(steps)
else:
    print(6-n)


