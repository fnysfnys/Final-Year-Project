def numberOfArithmeticSlices(nums):
   return len([i for i in range(len(nums) - 2) if nums[i + 1] - nums[i] == nums[i + 2] - nums[i + 1]])
