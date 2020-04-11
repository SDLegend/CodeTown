#https://www.hackerrank.com/contests/quarantine-day-14/challenges/new-year-chaos/submissions/code/1322240612

def bubbleSort(lst,n):
    swaps,levels=0,0
    elemswaps=dict()
    for i in range(n):
        elemswaps[i+1]=0
    for i in range(n):
        flag=True
        for j in range(n-1):
            if lst[j]>lst[j+1]:
                elemswaps[lst[j]]+=1
                lst[j],lst[j+1]=lst[j+1],lst[j]
                flag=False
        if flag:
            break
        levels+=1
    return elemswaps

for _ in range(int(input())):
    n=int(input())
    lst=[int(x) for x in input().split()]
    ans=bubbleSort(lst.copy(),n)
    #print(ans,lst)
    flag=True
    count=0
    for i in ans:
        count+=ans[i]
        if ans[i]>2:
            flag=False
            print("Too chaotic")
            break
    if flag:
        print(count)
