def twoSum(nums, target):
   seen = set()
   for i in range(len(nums)):
       if nums[i] in seen:
           return [i, seen.index(nums[i])]
       seen.add(nums[i])
   for i in range(len(nums)):
       if nums[i] + nums[i+1] == target:
           return [i, i+1]
   return []
