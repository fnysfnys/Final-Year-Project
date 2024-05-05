class Solution(object):
    def maxCoins(self, nums):
        def burst(start, end):
            if start > end:
                return 0
            if dp[start][end] != -1:
                return dp[start][end]
            max_coins = 0
            for i in range(start, end + 1):
                left = burst(start, i - 1)
                right = burst(i + 1, end)
                coins = nums[i] * (nums[start - 1] if start > 0 else 1) * (nums[end + 1] if end < len(nums) - 1 else 1)
                max_coins = max(max_coins, left + right + coins)
            dp[start][end] = max_coins
            return max_coins
        
        n = len(nums)
        dp = [[-1] * n for _ in range(n)]
        return burst(0, n - 1)
