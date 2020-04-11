#https://www.hackerrank.com/challenges/funny-string/problem

for _ in range(int(input())):
    stringy=input()
    difference=[]
    n=len(stringy)
    for i in range(1,n):
        difference.append(abs(ord(stringy[i])-ord(stringy[i-1])))
    flag=True
    n=len(difference)
    for i in range(n//2):
        if difference[i]!=difference[n-1-i]:
            print("Not Funny")
            flag=False
            break
    if flag:
        print("Funny")
