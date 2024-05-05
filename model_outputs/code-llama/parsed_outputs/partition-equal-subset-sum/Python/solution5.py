class Solution(object):
    def canPartition(self, nums):
       total = sum(nums)
       if total % 2 == 1:
           return False
       total //= 2
       subset = {}
       for num in nums:
           if num <= total:
               subset[num] = subset.get(num, 0) + 1
       return all(subset[num] == 1 for num in subset)
    
