n=int(input())
stringy=str(bin(n))[2:]
stringy=stringy.replace("1","0",1)
print(int(stringy,2)<<1)
