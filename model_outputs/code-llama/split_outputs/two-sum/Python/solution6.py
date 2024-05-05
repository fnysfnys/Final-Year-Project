def twoSum(nums, target):
   if len(nums) == 0:
       return []
   if nums[0] + nums[1] == target:
       return [0, 1]
   return twoSum(nums[1:], target)
