class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        map={}
        c=0
        for i in nums:
            if i in map:
                c+=map[i]
                map[i]+=1
            else:
                map[i]=1
        return c