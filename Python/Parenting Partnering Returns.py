def customsort(x):
    return x[0]

def collides(timelst,person):
    for i in person:
        if (timelst[0]>=i[0] and timelst[0]<i[1]):
            return True
        if (timelst[1]>i[0] and timelst[1]<=i[1]):
            return True
    return False

for _ in range(int(input())):
    n=int(input())
    time=[]
    for i in range(n):
        time.append([int(x) for x in input().split()])
    interval=sorted(time,key=customsort)
    cameron,jamie=[],[]
    flag=True
    print("Case #{}:".format(_+1),end=" ")
    print(time)
    for i in interval:
        print(i)
        if collides(i,cameron):
            if collides(i,jamie):
                print("IMPOSSIBLE")
                flag=False
                break
            else:
                jamie.append(i)
        else:
            cameron.append(i)
        print(cameron,jamie)
    if flag:
        answer=""
        for i in time:
            if i in jamie:
                answer+="J"
            else:
                answer+="C"
        print(answer)
