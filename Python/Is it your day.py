"""n=int(input())
stringy=input()
if n==6:
    print("Yes")
else:
    print("No")"""

d=int(input())
m=int(input())
y=int(input())
if y>2020:
    print("My day") 
elif y==2020:
    if m>4:
        print("My day")
    elif m==4:
        if d>1:
            print("My day")
        else:
            print("Not my day")
    else:
        print("Not my day")
else:
    print("Not my day")
    
