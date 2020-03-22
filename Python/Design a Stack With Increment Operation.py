#https://leetcode.com/contest/weekly-contest-180/problems/design-a-stack-with-increment-operation/

class CustomStack:

    def __init__(self, maxSize: int):
        self.stack=[]
        self.size=0
        self.maxSize=maxSize

    def push(self, x: int) -> None:
        if self.size<self.maxSize:
            self.stack.append(x)
            self.size+=1

    def pop(self) -> int:
        if self.size>0:
            self.size-=1
            return self.stack.pop()
        else:
            return -1

    def increment(self, k: int, val: int) -> None:
        if val==0:
            pass
        else:
            for i in range(k):
                if i<self.size:
                    self.stack[i]+=val
            #print(self.stack)


# Your CustomStack object will be instantiated and called as such:
# obj = CustomStack(maxSize)
# obj.push(x)
# param_2 = obj.pop()
# obj.increment(k,val)