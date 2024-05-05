class Solution(object):
    def canPartition(self, nums):
       total = sum(nums)
       if total % 2 == 1:
           return False
       total //= 2
       dp = [[0] * (total + 1) for _ in range(len(nums) + 1)]
       for i in range(1, len(nums) + 1):
           for j in range(1, total + 1):
               if i == 1:
                   dp[i][j] = nums[i - 1] <= j
               else:
                   dp[i][j] = dp[i - 1][j - nums[i - 1]] or dp[i - 1][j]
       return dp[len(nums)][total]
    
