def maxCoins(nums):
   dp = [0] * len(nums)
   for i in range(len(nums)):
       dp[i] = nums[i-1] * nums[i] * nums[i+1]
   for i in range(len(nums)-2, -1, -1):
       dp[i] = max(dp[i], dp[i+1])
   return dp[0]
