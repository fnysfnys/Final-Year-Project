class Solution(object):
    def twoSum(self, nums, target):
       seen = set()
       for i in range(len(nums)):
           if nums[i] in seen:
               return [i, seen.index(nums[i])]
           seen.add(nums[i])
       return []
    
