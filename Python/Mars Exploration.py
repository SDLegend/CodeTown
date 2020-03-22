#https://www.hackerrank.com/challenges/mars-exploration/problem

stringy=input()
message="SOS"

count=0
for i in range(len(stringy)):
    if stringy[i]==message[i%3]:
        pass
    else:
        count+=1
print(count)
