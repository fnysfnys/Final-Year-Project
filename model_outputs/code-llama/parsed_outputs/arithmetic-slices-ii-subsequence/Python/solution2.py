class Solution(object):
    def numberOfArithmeticSlices(self, nums):
       dp = [0] * len(nums)
       for i in range(len(nums)):
           if i == 0:
               dp[i] = 0
           else:
               dp[i] = dp[i - 1] + 1
       for i in range(1, len(nums)):
           for j in range(i + 1, len(nums)):
               if nums[j] - nums[i] == nums[i] - nums[i - 1]:
                   dp[j] = max(dp[j], dp[i] + 1)
       return dp[-1]
    
