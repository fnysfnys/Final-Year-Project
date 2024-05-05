def maxCoins(nums):
   memo = {}
   def helper(i):
       if i in memo:
           return memo[i]
       if i == len(nums):
           return 0
       coins = nums[i-1] * nums[i] * nums[i+1]
       memo[i] = coins
       return coins
   return helper(0)
