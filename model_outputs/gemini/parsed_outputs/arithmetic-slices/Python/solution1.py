class Solution(object):
    def numberOfArithmeticSlices(self, nums):
      n = len(nums)
      dp = [[0] * n for _ in range(n)]
      for i in range(2, n):
        if nums[i] - nums[i-1] == nums[i-1] - nums[i-2]:
          dp[i][i] = dp[i-1][i-1] + 1
      return sum(row[i] for i in range(2, n) for row in dp)
    
