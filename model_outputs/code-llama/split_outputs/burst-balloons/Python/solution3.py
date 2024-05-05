def maxCoins(nums):
   return max(nums[i-1] * nums[i] * nums[i+1] for i in range(len(nums)))
