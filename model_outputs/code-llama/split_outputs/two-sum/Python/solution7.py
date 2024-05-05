def twoSum(nums, target):
   if len(nums) == 0:
       return []
   mid = len(nums) // 2
   left = twoSum(nums[:mid], target)
   right = twoSum(nums[mid:], target)
   return left + right
