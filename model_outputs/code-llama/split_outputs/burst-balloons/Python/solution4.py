def maxCoins(nums):
   if len(nums) == 1:
       return nums[0]
   else:
       return max(nums[0] * nums[1] * nums[2], maxCoins(nums[1:]))
