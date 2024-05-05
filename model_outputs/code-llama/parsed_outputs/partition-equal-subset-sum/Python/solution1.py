class Solution(object):
    def canPartition(self, nums):
       total = sum(nums)
       if total % 2 == 1:
           return False
       total //= 2
       subset_sums = {}
       for num in nums:
           if num <= total:
               subset_sums[num] = subset_sums.get(num, 0) + 1
       return all(subset_sums[num] == 1 for num in subset_sums)
    
