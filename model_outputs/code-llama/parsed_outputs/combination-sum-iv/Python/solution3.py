class Solution(object):
    def combinationSum4(self, nums, target):
       dp = [[0] * (target + 1) for _ in range(len(nums))]
       for i in range(len(nums)):
           for j in range(target + 1):
               if j == 0:
                   dp[i][j] = 1
               else:
                   dp[i][j] = dp[i-1][j-nums[i]] + dp[i-1][j]
       return dp[len(nums) - 1][target]
    
