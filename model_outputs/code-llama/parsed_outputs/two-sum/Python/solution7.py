class Solution(object):
    def twoSum(self, nums, target):
       if len(nums) == 0:
           return []
       mid = len(nums) // 2
       left = self.twoSum(nums[:mid], target)
       right = self.twoSum(nums[mid:], target)
       return left + right
    
