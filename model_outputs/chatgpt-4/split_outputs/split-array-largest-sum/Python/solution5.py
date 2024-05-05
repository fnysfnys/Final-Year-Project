class Solution:
    def splitArray(self, nums, k):
        n = len(nums)
        dp = [[float('inf')] * (k + 1) for _ in range(n + 1)]
        pre_sum = [0]
        for num in nums:
            pre_sum.append(pre_sum[-1] + num)

        for i in range(1, n + 1):
            dp[i][1] = pre_sum[i]
        
        for j in range(2, k + 1):
            for i in range(j, n + 1):
                for p in range(j - 1, i):
                    dp[i][j] = min(dp[i][j], max(dp[p][j - 1], pre_sum[i] - pre_sum[p]))
        
        return dp[n][k]
