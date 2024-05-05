class Solution(object):
    def combinationSum4(self, nums, target):
       if target == 0:
           return 1
       count = 0
       for num in nums:
           count += self.combinationSum4(nums, target - num)
       return count
    
