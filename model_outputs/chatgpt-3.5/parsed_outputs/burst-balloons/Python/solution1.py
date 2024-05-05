class Solution(object):
    def maxCoins(self, nums):
        """
        Dynamic programming solution.
        Time complexity: O(n^3)
        Space complexity: O(n^2)
        """
        n = len(nums)
        nums = [1] + nums + [1]
        dp = [[0] * (n + 2) for _ in range(n + 2)]

        for length in range(1, n + 1):
            for left in range(1, n - length + 2):
                right = left + length - 1
                for k in range(left, right + 1):
                    dp[left][right] = max(dp[left][right], dp[left][k - 1] + nums[left - 1] * nums[k] * nums[right + 1] + dp[k + 1][right])

        return dp[1][n]