class Solution:
    def splitArray(self, nums, k):
        n = len(nums)
        dp = [0] + [float('inf')] * n
        prefix_sum = [0] * (n + 1)
        for i in range(1, n + 1):
            prefix_sum[i] = prefix_sum[i - 1] + nums[i - 1]
        
        for _ in range(k):
            for i in range(n, 0, -1):
                for j in range(i):
                    dp[i] = min(dp[i], max(dp[j], prefix_sum[i] - prefix_sum[j]))
        return dp[n]
