class Solution(object):
    def maxCoins(self, nums):
        n = len(nums)
        nums = [1] + nums + [1]
        dp = [[0] * (n + 2) for _ in range(n + 2)]
        for length in range(1, n + 1):
            for start in range(1, n - length + 2):
                end = start + length - 1
                for i in range(start, end + 1):
                    dp[start][end] = max(dp[start][end], dp[start][i - 1] + nums[start - 1] * nums[i] * nums[end + 1] + dp[i + 1][end])
        return dp[1][n]
