#https://codingcompetitions.withgoogle.com/codejam/round/000000000019fd27/0000000000209a9f

for _ in range(int(input())):
    stringy=input()
    lst=list(stringy)
    stack=[]
    length=0
    #print(lst)
    for i in range(len(stringy)):
        #print(lst[i],length)
        if int(lst[i])<length:
            #print("Inside 1st if")
            for j in range(length-int(lst[i])):
                stack.append(")")
            length-=length-int(lst[i])
        elif int(lst[i])>length:
            #print("inside 2nd if")
            for j in range(int(lst[i])-length):
                #print("Appending (")
                stack.append("(") 
            length+=int(lst[i])-length
        stack.append(lst[i])
        #print(stack)
    if length:
        for j in range(length):
            stack.append(")")
    print("Case #{}:".format(_+1),end=" ")
    print("".join(stack))
