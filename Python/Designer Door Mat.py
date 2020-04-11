n,m=[int(x) for x in input().split()]
lst=[]
for i in range(1,n//2+1):
    left="-"*((m-3*(2*i-1))//2)
    #print(left)
    middle=".|."*(1+2*(i-1))
    #right="-"*(m*(i-1))
    lst.append(left+middle+left)
stringy="-"*((m-7)//2)+"WELCOME"+"-"*((m-7)//2)
for i in lst:
    print(i)
print(stringy)
for i in lst[::-1]:
    print(i)
