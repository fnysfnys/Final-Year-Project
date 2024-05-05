def numberOfArithmeticSlices(nums):
   if len(nums) < 3:
       return 0
   else:
       mid = len(nums) // 2
       left = numberOfArithmeticSlices(nums[:mid])
       right = numberOfArithmeticSlices(nums[mid:])
       return left + right
