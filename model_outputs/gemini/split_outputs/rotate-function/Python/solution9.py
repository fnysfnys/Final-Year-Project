import numpy as np

def maxRotateFunction(self, nums):
    n = len(nums)
    nums_cumsum = np.cumsum(nums)
    nums_rev_cumsum = np.cumsum(nums[::-1])[::-1]
    f = nums_cumsum * (np.arange(n) - 1) - nums_rev_cumsum[1:] * (n - 1 - np.arange(n - 1))
    return int(f.max())
