class Solution(object):
    def maxRotateFunction(self, nums):
        n = len(nums)
        total_sum = sum(nums)
        F_0 = sum(i * nums[i] for i in range(n))
        max_val = F_0
        window_sum = F_0
        for k in range(1, n):
            window_sum += total_sum - n * nums[n - k]
            max_val = max(max_val, window_sum)
        return max_val
