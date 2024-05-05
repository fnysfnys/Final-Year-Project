class Solution(object):
    def combinationSum4(self, nums, target):
       if len(nums) == 1:
           return 1
       mid = len(nums) // 2
       left = nums[:mid]
       right = nums[mid:]
       count = self.combinationSum4(left, target) + self.combinationSum4(right, target)
       return count
    
