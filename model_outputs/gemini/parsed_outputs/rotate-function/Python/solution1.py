class Solution(object):
    def maxRotateFunction(self, nums):
        n = len(nums)
        f_prev, f_current = 0, 0
        for i in range(n):
            f_current = (f_current + nums[i] * (i - 1)) % (2**31 - 1)
        return (f_current + sum(nums) * (n - 1)) % (2**31 - 1)
    
