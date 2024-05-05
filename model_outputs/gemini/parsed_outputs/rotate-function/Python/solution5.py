class Solution(object):
    def maxRotateFunction(self, nums):
        n = len(nums)
        f_prev, f_current = 0, 0
        for i in range(n):
            f_current = (f_current + nums[i] * (i - 1) - nums[i - 1] * (n - 2)) % (2**31 - 1)
        return max(f_prev, f_current)
    
