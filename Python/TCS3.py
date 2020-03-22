def replace(stringy,char,vowels):
    s=""
    for i in stringy:
        if i in ["a","e","i","o","u","A","E","I","O","U"] and vowels==True:
            s+=char
        else:
            s+=i
    return s

def uppercase(stringy):
    s=""
    for i in stringy:
        if (ord(i)>=97 and ord(i)<=122):
            s+=chr(ord(i)-32)
        else:
            s+=i
    return s

print(replace(input(),"%",True)+replace(input(),"#",False)+uppercase(input()))
         
        
            
