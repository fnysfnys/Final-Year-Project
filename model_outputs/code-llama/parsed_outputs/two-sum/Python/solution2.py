class Solution(object):
    def twoSum(self, nums, target):
       seen = {}
       for i in range(len(nums)):
           if nums[i] in seen:
               return [seen[nums[i]], i]
           seen[nums[i]] = i
       return []
    
