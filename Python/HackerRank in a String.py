#https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem

for _ in range(int(input())):
    stringy=input()
    target="hackerrank"
    i,j=0,0
    while i<len(stringy) and j<len(target):
        if stringy[i]==target[j]:
            j+=1
        i+=1
    if j==10:
        print("YES")
    else:
        print("NO")
    
        

