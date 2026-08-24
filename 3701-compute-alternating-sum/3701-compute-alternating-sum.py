class Solution:
    def alternatingSum(self, nums: List[int]) -> int:
        a=0
        
        for i in range(len(nums)):
            if(i%2==0):
                a+=nums[i]
            else:
                a-=nums[i]
        return a;

