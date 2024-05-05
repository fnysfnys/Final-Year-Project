    class Solution(object):
        def splitArray(self, nums, k):
            n = len(nums)
            dp = [[float('inf')] * (k + 1) for _ in range(n + 1)]
            prefix_sum = [0] * (n + 1)
            for i in range(1, n + 1):
                prefix_sum[i] = prefix_sum[i - 1] + nums[i - 1]
                dp[i][1] = prefix_sum[i]

            for i in range(2, n + 1):
                for j in range(2, k + 1):
                    for m in range(i - 1, 0, -1):
                        dp[i][j] = min(dp[i][j], max(dp[m][j - 1], prefix_sum[i] - prefix_sum[m]))

            return dp[n][k]
    