#https://codingcompetitions.withgoogle.com/kickstart/round/000000000019ffc7/00000000001d40bb

for _ in range(int(input())):
    n,k=[int(x) for x in input().split()]
    lst=[int(x) for x in input().split()]
    diff=[]
    if k==1:
        maxdiff=0
        index=0
        for i in range(1,n):
            diff.append(lst[i]-lst[i-1])
            if lst[i]-lst[i-1]>maxdiff:
                maxdiff=lst[i]-lst[i-1]
                index=i
        print(diff)
        diff[index-1]=maxdiff//2
        diff.insert(index-1,maxdiff-maxdiff//2)
        print(diff)
        print(max(diff))           
    else:
        print("Still solving")
