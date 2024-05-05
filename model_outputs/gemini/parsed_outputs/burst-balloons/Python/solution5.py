class Solution(object):
    def maxCoins(self, nums):
      n = len(nums)
      nums = [1] + nums + [1]  # Add boundary 1s
      memo = [[0] * (n+2) for _ in range(n+2)]
      for i in range(n-1, -1, -1):
        for j in range(i+2, n+3):
          for k in range(i+1, j):
            memo[i][j] = max(memo[i][j], nums[i] * nums[k] * nums[j] + memo[i][k] + memo[k][j])
      return memo[0][n+1]
    
