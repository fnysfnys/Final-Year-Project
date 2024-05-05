import numpy as np

def maxRotateFunction(self, nums):
    n = len(nums)
    f_prev = np.dot(nums, np.arange(n))
    for i in range(1, n):
        f_prev = (f_prev + nums[i - 1] * (n - i) - nums[n - i]) % (2**31 - 1)
    return f_prev
