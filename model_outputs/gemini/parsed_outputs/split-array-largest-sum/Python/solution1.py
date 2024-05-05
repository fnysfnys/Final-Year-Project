class Solution(object):
    def splitArray(self, nums, k):
        n = len(nums)
        dp = [[float('inf')] * (k + 1) for _ in range(n + 1)]
        prefix_sum = [0] * (n + 1)
        for i in range(1, n + 1):
            prefix_sum[i] = prefix_sum[i - 1] + nums[i - 1]
        
        for i in range(1, n + 1):
            for j in range(1, min(k + 1, i + 1)):
                for p in range(i - j):
                    dp[i][j] = min(dp[i][j], max(dp[p][j - 1], prefix_sum[i] - prefix_sum[p]))
        
        return dp[n][k]
    
