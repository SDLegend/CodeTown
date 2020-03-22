for _ in range(int(input())):
    n,q=[int(x) for x in input().split()]
    lst=[int(x) for x in input().split()]
    evenparity,oddparity=0,0
    for i in lst:
        if str(bin(i))[2:].count("1")%2==0:
            evenparity+=1
        else:
            oddparity+=1
    for i in range(q):
        j=int(input())
        if str(bin(j))[2:].count("1")%2==0:
            print(evenparity,oddparity)
        else:
            print(oddparity,evenparity)
        
