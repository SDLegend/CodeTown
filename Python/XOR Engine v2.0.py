def parity(x): 
    y = x ^ (x >> 1); 
    y = y ^ (y >> 2); 
    y = y ^ (y >> 4); 
    y = y ^ (y >> 8); 
    y = y ^ (y >> 16); 
    if (y & 1): 
        return True; 
    return False; 

for _ in range(int(input())):
    n,q=[int(x) for x in input().split()]
    lst=[int(x) for x in input().split()]
    evenparity=0
    for i in lst:
        if parity(i):
            evenparity+=1
    for i in range(q):
        if parity(int(input())):
            print(evenparity,n-evenparity)
        else:
            print(n-evenparity,evenparity)
