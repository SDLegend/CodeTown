#https://www.hackerearth.com/challenges/competitive/march-circuits-20/algorithm/dislikes-and-party-567b9605/

n=int(input())
people=dict()
for i in range(10):
    lst=[int(x) for x in input().split()]
    people[lst[0]]=set(lst[1:])
count=0
for i in people:
    for j in people:
        if i==j:
            continue
        if i in people[j] or j in people[i]:
            count+=1
            if i in people[j]:
                people[j].remove(i)
            if j in people[i]:
                people[i].remove(j)
    #print(people)
for i in people:
    count+=len(people[i])
print((n*(n-1))//2-count)
#print((n*(n-1))//2)
#print(count)
