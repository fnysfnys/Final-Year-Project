class Solution(object):
    def maxRotateFunction(self, nums):
        n = len(nums)
        f_prev = sum(i * num for i, num in enumerate(nums))
        return max(f_prev + sum(nums[i:]) * (n - i - 1) for i in range(n))
    
