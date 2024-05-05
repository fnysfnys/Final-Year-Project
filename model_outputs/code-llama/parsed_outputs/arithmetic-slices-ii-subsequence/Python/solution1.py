class Solution(object):
    def numberOfArithmeticSlices(self, nums):
       slices = 0
       for i in range(len(nums) - 2):
           for j in range(i + 1, len(nums) - 1):
               for k in range(j + 1, len(nums)):
                   if nums[k] - nums[j] == nums[j] - nums[i]:
                       slices += 1
       return slices
    
