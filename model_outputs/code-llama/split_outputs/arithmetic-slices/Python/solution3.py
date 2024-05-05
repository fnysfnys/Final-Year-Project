def numberOfArithmeticSlices(nums):
   return len(list(zip(nums, nums[1:], nums[2:])))
