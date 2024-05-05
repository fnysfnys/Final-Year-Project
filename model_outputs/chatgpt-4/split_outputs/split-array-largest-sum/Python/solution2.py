class Solution:
    def splitArray(self, nums, k):
        n = len(nums)
        dp = [[float('inf')] * (k + 1) for _ in range(n + 1)]
        sub_sum = [0] * (n + 1)
        for i in range(n):
            sub_sum[i + 1] = sub_sum[i] + nums[i]
        
        dp[0][0] = 0
        for i in range(1, n + 1):
            for j in range(1, k + 1):
                for m in range(i):
                    dp[i][j] = min(dp[i][j], max(dp[m][j - 1], sub_sum[i] - sub_sum[m]))
        return dp[n][k]
