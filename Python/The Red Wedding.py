#https://dare2compete.com/competitions/105321/round/58044/play

n=int(input())
lst=[]
for i in range(n):
    lst.append([x for x in input().split()])
names,values=set(),[]
city=dict()
for i in lst:
    if i[0] in city:
        city[i[0]].append(int(i[1]))
    else:
        city[i[0]]=[int(i[1])]
    names.add(i[0])
    values.append(int(i[1]))
names=sorted(names)
answer=dict()
count=1
#print(city)
#print(names)
for i in names:
    for j in sorted(city[i],reverse=True):
        answer[j]=count
        count+=1
#print(answer)
for i in values:
    print(answer[i])
        
