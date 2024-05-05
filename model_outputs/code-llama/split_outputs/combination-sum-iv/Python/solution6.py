def combinationSum4(nums, target):
   if len(nums) == 1:
       return 1
   mid = len(nums) // 2
   left = nums[:mid]
   right = nums[mid:]
   count = combinationSum4(left, target) + combinationSum4(right, target)
   return count
