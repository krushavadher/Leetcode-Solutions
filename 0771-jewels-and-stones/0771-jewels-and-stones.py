class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        jset=set(jewels)
        c=0
        for i in stones:
            if i in jset:
                c+=1
        return c