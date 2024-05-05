class Solution(object):
    def maxRotateFunction(self, nums):
        n = len(nums)
        prefix_sum = [0] * n
        prefix_sum[0] = sum(nums)
        for i in range(1, n):
            prefix_sum[i] = prefix_sum[i - 1] + nums[i]
        max_val = float('-inf')
        for k in range(n):
            F_k = prefix_sum[-1] - prefix_sum[k] + nums[k] * (n - k)
            max_val = max(max_val, F_k)
        return max_val
