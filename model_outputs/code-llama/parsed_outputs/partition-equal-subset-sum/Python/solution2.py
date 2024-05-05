class Solution(object):
    def canPartition(self, nums):
       total = sum(nums)
       if total % 2 == 1:
           return False
       total //= 2
       def helper(nums, subset_sums):
           if not nums:
               return True
           num = nums[0]
           if num <= total:
               subset_sums[num] = subset_sums.get(num, 0) + 1
               if helper(nums[1:], subset_sums):
                   return True
               subset_sums[num] -= 1
           return False
       return helper(nums, {})
    
