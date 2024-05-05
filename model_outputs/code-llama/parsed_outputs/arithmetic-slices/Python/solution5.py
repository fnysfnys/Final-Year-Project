import numpy as np

class Solution(object):
    def numberOfArithmeticSlices(self, nums):
       return np.sum(np.diff(nums) == np.diff(nums, axis=0))
    
