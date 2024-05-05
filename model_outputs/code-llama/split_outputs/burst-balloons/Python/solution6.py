def maxCoins(nums):
   if len(nums) == 1:
       return nums[0]
   mid = len(nums) // 2
   left = maxCoins(nums[:mid])
   right = maxCoins(nums[mid:])
   return left * right
