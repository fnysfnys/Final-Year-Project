from scipy.signal import argrelextrema

def numberOfArithmeticSlices(nums):
   return len(argrelextrema(nums, np.diff(nums), np.diff(nums, axis=0)))
