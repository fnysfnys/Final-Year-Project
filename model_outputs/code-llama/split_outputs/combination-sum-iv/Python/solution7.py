def combinationSum4(nums, target):
   nums.sort()
   count = 0
   for i in range(len(nums)):
       if nums[i] <= target:
           count += 1
   return count
