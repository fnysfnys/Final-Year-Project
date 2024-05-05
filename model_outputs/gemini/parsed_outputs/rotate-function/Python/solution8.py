class Solution(object):
    def maxRotateFunction(self, nums):
        n = len(nums)
        f_prev, f_current = 0, 0
        for i in range(n):
            f_current = (f_current + sum(nums[i:]) * (n - i - 1) - sum(nums[:i]) * i) % (2**31 - 1)
        return max(f_prev, f_current)
    
