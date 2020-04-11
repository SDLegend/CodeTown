def minsteps(stringy):
    n=len(stringy)
    count=0
    for i in range(n//2):
        count+=abs(ord(stringy[i])-ord(stringy[n-1-i]))
    return count


for _ in range(int(input())):
    stringy=input()
    print(minsteps(stringy))
