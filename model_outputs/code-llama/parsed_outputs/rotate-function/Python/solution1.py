class Solution(object):
    def maxRotateFunction(self, nums):
       max_val = 0
       for i in range(len(nums)):
           val = 0
           for j in range(len(nums)):
               val += (j * nums[j])
           max_val = max(max_val, val)
       return max_val
    
