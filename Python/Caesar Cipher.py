#https://www.hackerrank.com/challenges/caesar-cipher-1/problem

n=int(input())
stringy=input()
k=int(input())
s=""
for i in stringy:
    if ord(i)>=65 and ord(i)<=90:
        temp=(ord(i)+k-65)%26
        s+=chr(temp+65)
    elif ord(i)>=97 and ord(i)<=122:
        temp=(ord(i)+k-97)%26
        s+=chr(temp+97)
    else:
        s+=i
print(s)
