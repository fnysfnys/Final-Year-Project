class Solution(object):
    def canPartition(self, nums):
       total = sum(nums)
       if total % 2 == 1:
           return False
       total //= 2
       subset = []
       for num in nums:
           if num <= total:
               subset.append(num)
       return len(subset) == len(nums)
    
