from itertools import accumulate

class Solution(object):
    def maxRotateFunction(self, nums):
        n = len(nums)
        nums_cumsum = list(accumulate(nums))
        f_prev, f_current = 0, 0
        for i in range(n):
            f_current = (f_current + nums[i] * (i - 1) - nums_cumsum[i - 1]) % (2**31 - 1)
        return max(f_prev, f_current)
    
