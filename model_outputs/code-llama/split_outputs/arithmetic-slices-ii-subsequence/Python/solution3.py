def numberOfArithmeticSlices(nums):
   slices = 0
   for i in range(len(nums) - 2):
       for j in range(i + 1, len(nums) - 1):
           if nums[j] - nums[i] == nums[j + 1] - nums[j]:
               slices += 1
   return slices
