def numberOfArithmeticSlices(nums):
   slices = 0
   for i in range(len(nums) - 2):
       if nums[i + 1] - nums[i] == nums[i + 2] - nums[i + 1]:
           slices += 1
   return slices
