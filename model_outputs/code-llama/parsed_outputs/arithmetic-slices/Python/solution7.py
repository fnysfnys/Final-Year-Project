from scipy.signal import argrelextrema

class Solution(object):
    def numberOfArithmeticSlices(self, nums):
       return len(argrelextrema(nums, np.diff(nums), np.diff(nums, axis=0)))
    
