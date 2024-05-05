class Solution(object):
    def maxRotateFunction(self, nums):
        n = len(nums)
        dp = [0] * n
        dp[0] = sum(i * nums[i] for i in range(n))
        total_sum = sum(nums)
        max_val = dp[0]
        for k in range(1, n):
            dp[k] = dp[k - 1] + total_sum - n * nums[n - k]
            max_val = max(max_val, dp[k])
        return max_val
