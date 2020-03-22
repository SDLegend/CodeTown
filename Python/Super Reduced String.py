#https://www.hackerrank.com/challenges/reduced-string/problem

stringy=input()

current=stringy+""
previous=""

while not current==previous:
    n=len(current)
    temp=""
    i=0
    while i<n:
        if i+1<n and current[i]==current[i+1]:
            i+=1
            pass
        else:
            temp+=current[i]
        i+=1
    previous=current+""
    current=temp
    #print(current,previous)

if current=="":
    print("Empty String")
else:
    print(current)
