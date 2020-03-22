#https://codingcompetitions.withgoogle.com/kickstart/round/000000000019ffc7/00000000001d3f56

for _ in range(int(input())):
    n,budget=[int(x) for x in input().split()]
    lst=[int(x) for x in input().split()]
    sortedlst=sorted(lst)
    tempsum,quantity=0,0
    for i in range(n):
        if tempsum+sortedlst[i]<=budget:
            tempsum+=sortedlst[i]
            quantity+=1
    print("Case #{}:".fomrat(_+1),quantity)
