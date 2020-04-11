for _ in range(int(input())):
    stringy=input()
    count=0
    for i in range(len(stringy)-1):
        if stringy[i]==stringy[i+1]:
            count+=1
    print(count)
