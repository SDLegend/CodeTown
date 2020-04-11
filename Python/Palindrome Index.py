#https://www.hackerrank.com/challenges/palindrome-index/problem

for _ in range(int(input())):
    stringy=input()
    frequency=dict()
    for i in stringy:
        if i in frequency:
            frequency[i]+=1
        else:
            frequency[i]=1
    odds,oddcount=set(),0
    for i in frequency:
        if frequency[i]%2!=0:
            oddcount+=1
            odds.add(i)
    #print(frequency)
    if oddcount>2:
        print(-1)
    elif stringy==stringy[::-1]:
        print(-1)
    else:
        n=len(stringy)
        for i in range(n):
            if stringy[i] in odds:
                s=""
                for j in range(n):
                    if j==i:
                        continue
                    s+=stringy[j]
                if s==s[::-1]:
                    print(i)
                    break
    
