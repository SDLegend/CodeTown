class Solution:
    def closestDivisors(self, num: int) -> List[int]:
        mymin=num+1
        divisor=num+1
        for i in range(1,int(math.sqrt(num+1))+1):
            if abs(i-(num+1)//i)<mymin and ((num+1)/i-int((num+1)/i)==0):
                mymin=abs(i-(num+1)//i)
                divisor=i+0
                print(mymin,divisor,(num+1)//divisor)
        print("Next")
        mymin2=num+2
        divisor2=num+2
        for i in range(1,int(math.sqrt(num+2))+1):
            if abs(i-(num+2)//i)<mymin and (num+2)/i-int((num+2)/i)==0:
                mymin2=abs(i-(num+2)//i)
                divisor2=i
                print(mymin2,divisor2,(num+2)//divisor2)
        if mymin<mymin2:
            return [divisor,(num+1)//divisor]
        return [divisor2,(num+2)//divisor2]