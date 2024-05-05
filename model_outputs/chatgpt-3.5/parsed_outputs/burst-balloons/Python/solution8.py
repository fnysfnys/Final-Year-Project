class Solution(object):
    def maxCoins(self, nums):
        """
        Bottom-up dynamic programming approach.
        Time complexity: O(n^3)
        Space complexity: O(n^2)
        """
        n = len(nums)
        nums = [1] + nums + [1]
        dp = [[0] * (n + 2) for _ in range(n + 2)]

        for length in range(1, n + 1):
            for left in range(n - length + 1):
                right = left + length + 1
                for k in range(left + 1, right):
                    dp[left][right] = max(dp[left][right], dp[left][k] + dp[k][right] + nums[left] * nums[k] * nums[right])

        return dp[0][n + 1]