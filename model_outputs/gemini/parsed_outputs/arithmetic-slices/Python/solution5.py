class Solution(object):
    def numberOfArithmeticSlices(self, nums):
      n = len(nums)
      if n < 3:
        return 0
      prev2, prev1 = 0, 0
      count = 0
      for i in range(2, n):
        if nums[i] - nums[i-1] == nums[i-1] - nums[i-2]:
          count += prev1 + 1
        prev2, prev1 = prev1, count
      return count
    
