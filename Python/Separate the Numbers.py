#https://www.hackerrank.com/challenges/separate-the-numbers/problem

for _ in range(int(input())):
    stringy=input()
    i,j,n=0,1,len(stringy)
    lst=[]
    flag=False
    while i<n and j<n:
        temp=str(int(stringy[i:j])+1)
        prevn=len(stringy[i:j])
        tempn=len(temp)
        print(temp,i,j,stringy[i+prevn:j+tempn])
        if temp==stringy[i+prevn:j+tempn]:
            print("INSIDE:",temp)
            lst.append(stringy[i:j])
            i+=prevn
            j+=tempn
            flag=True
        else:
            j+=1
            flag=False
    if flag:
        print("YES",lst[0])
    else:
        print("NO")
