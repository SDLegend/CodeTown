#https://www.hackerrank.com/challenges/anagram/problem

for _ in range(int(input())):
    stringy=input()
    n=len(stringy)
    if n%2==0:
        first,second=dict(),dict()
        for i in range(n):
            if i<n//2:
                if stringy[i] in first:
                    first[stringy[i]]+=1
                else:
                    first[stringy[i]]=1
            else:
                if stringy[i] in second:
                    second[stringy[i]]+=1
                else:
                    second[stringy[i]]=1
        count=0
        for i in second:
            if i in first:
                common=min([first[i],second[i]])
                count+=common
        print(n//2-count)
    else:
        print(-1)






            
