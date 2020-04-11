#https://www.hackerrank.com/challenges/beautiful-binary-string/problem

n=int(input())
stringy=input()
i,count=1,0
while i<n-1:
    if stringy[i]=="1" and stringy[i-1]=="0" and stringy[i+1]=="0":
        count+=1
        i+=2
    i+=1
print(count)
