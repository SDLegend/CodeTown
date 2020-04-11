#https://www.hackerrank.com/challenges/making-anagrams/problem

s1,s2=input(),input()
freq1,freq2=dict(),dict()
for i in s1:
    if i in freq1:
        freq1[i]+=1
    else:
        freq1[i]=1
for i in s2:
    if i in freq2:
        freq2[i]+=1
    else:
        freq2[i]=1
common=0
for i in freq1:
    if i in freq2:
        common+=2*min([freq1[i],freq2[i]])
print(len(s1)+len(s2)-common)
