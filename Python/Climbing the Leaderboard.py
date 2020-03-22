#https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem

n=int(input())
scores=[int(x) for x in input().split()]
m=int(input())
alice=[int(x) for x in input().split()]

score=[]
for i in range(n):
    if i==0:
        score.append(scores[i])
    if not scores[i]==score[-1]:
        score.append(scores[i])
score=score[::-1]
#print(score)
newn=len(score)

i,j=0,0
while i<m and j<newn:
    #print(i,j,score)
    if score[j]>alice[i]:
        print(newn-j+1)
        i+=1
        continue
    j+=1
if i<m:
    for _ in range(m-i):
        print(newn-j+1)

