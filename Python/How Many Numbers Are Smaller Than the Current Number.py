class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        sortednums=sorted(nums)
        order=[]
        prev=-1
        n=len(nums)
        for i in range(n):
            if sortednums[i]==prev:
                order.append(order[-1])
            else:
                order.append(i)
                prev=sortednums[i]
        mydict=dict()
        for i in range(n):
            if sortednums[i] in mydict:
                continue
            else:
                mydict[sortednums[i]]=order[i]
        final=[]
        for i in range(n):
            final.append(mydict[nums[i]])
        return final
            