class Solution(object):
    def numberOfArithmeticSlices(self, nums):
       if len(nums) < 3:
           return 0
       else:
           return 1 + self.numberOfArithmeticSlices(nums[1:])
    
