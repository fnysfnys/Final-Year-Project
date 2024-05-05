class Solution(object):
    def maxCoins(self, nums):
        """
        Top-down dynamic programming approach.
        Time complexity: O(n^3)
        Space complexity: O(n^2)
        """
        n = len(nums)
        nums = [1] + nums + [1]
        dp = [[0] * (n + 2) for _ in range(n + 2)]

        def dfs(left, right):
            if left + 1 == right:
                return 0


            if dp[left][right] > 0:
                return dp[left][right]

            max_coins = 0
            for k in range(left + 1, right):
                coins = nums[left] * nums[k] * nums[right] + dfs(left, k) + dfs(k, right)
                max_coins = max(max_coins, coins)

            dp[left][right] = max_coins
            return max_coins

        return dfs(0, n + 1)
