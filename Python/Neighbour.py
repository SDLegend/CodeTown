class Person:
    def __init__(self,value,index):
        self.value=value
        self.index=index
    def getValue(self):
        return self.value
    def getIndex(self):
        return self.index

def customsort(x):
    return x.getValue()

def customsort2(x):
    return x.getIndex()

t=int(input())
for k in range(t):
    objects=[]
    n=int(input())
    lst=[int(x) for x in input().split()]
    for i in range(n):
        obj=Person(lst[i],i)
        objects.append(obj)
    #print(objects)
    
    sortedobjects=sorted(objects,key=customsort,reverse=True)
    #for i in sortedobjects:
    #    print(i.getValue())

    finalsum=0
    finalqueue=[]

    i=0
    for j in range(n):
        i=j
        tempsum=0
        tempcovered=set()
        tempqueue=[]
        while i<n:
            if sortedobjects[i].getValue()<=0:
                break
            ti=sortedobjects[i].getIndex()
            a,b=ti-1,ti+1
            if a in tempcovered or b in tempcovered:
                pass
            else:
                tempsum+=sortedobjects[i].getValue()
                tempcovered.add(ti)
                tempqueue.insert(0,sortedobjects[i])
            i+=1
        if tempsum>finalsum:
            finalsum=tempsum+0
            finalcovered=tempcovered.copy()
            finalqueue=[tempqueue.copy()]
        elif tempsum==finalsum:
            finalqueue.append(tempqueue)
        else:
            break

    for j in range(len(finalqueue)):
        finalqueue[j].sort(key=customsort2,reverse=True)

    #print("FinalQueue:",finalqueue)
    finalanswer=[]
    for j in finalqueue:
        answer=""
        for k in j:
            temp=str(k.getValue())
            answer+=temp
        finalanswer.append(answer)
    #print(finalanswer)
    finalanswer.sort(reverse=True)
    print(finalanswer[0])



