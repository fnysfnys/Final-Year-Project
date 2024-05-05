class Solution(object):
    def numberOfArithmeticSlices(self, nums):
       if len(nums) < 3:
           return 0
       else:
           mid = len(nums) // 2
           left = self.numberOfArithmeticSlices(nums[:mid])
           right = self.numberOfArithmeticSlices(nums[mid:])
           return left + right
    
