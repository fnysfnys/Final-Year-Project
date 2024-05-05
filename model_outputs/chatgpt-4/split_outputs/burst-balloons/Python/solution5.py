class Solution:
    def maxCoins(self, nums):
        """ Optimized dynamic programming approach. """
        nums = [1] + [num for num in nums if num > 0] + [1]
        n = len(nums)
        dp = [[0] * n for _ in range(n)]

        for gap in range(2, n):
            for left in range(n - gap):
                right = left + gap
                for i in range(left + 1, right):
                    dp[left][right] = max(dp[left][right],
                                          nums[left] * nums[i] * nums[right] + dp[left][i] + dp[i][right])
        return dp[0][n - 1]
