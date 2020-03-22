def addchars(s):
    stringy=s[0]
    for i in range(1,len(s)):
        if int(s[i])%2==0 and int(s[i-1])%2==0:
            stringy+="*"+s[i]
        elif int(s[i])%2==1 and int(s[i-1])%2==1:
            stringy+="-"+s[i]
        else:
            stringy+=s[i]
    return stringy

print(addchars(input()))
