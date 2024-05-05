import numpy as np

def numberOfArithmeticSlices(nums):
   return np.sum(np.diff(nums) == np.diff(nums, axis=0))
