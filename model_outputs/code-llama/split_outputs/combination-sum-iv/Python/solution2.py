def combinationSum4(nums, target):
   if target == 0:
       return 1
   count = 0
   for num in nums:
       count += combinationSum4(nums, target - num)
   return count
