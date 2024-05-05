def numberOfArithmeticSlices(nums):
   if len(nums) < 3:
       return 0
   else:
       return 1 + numberOfArithmeticSlices(nums[1:])
