class Solution(object):
    def maxCoins(self, nums):
        def burst(start, end):
            if start > end:
                return 0
            if (start, end) in memo:
                return memo[(start, end)]
            max_coins = 0
            for i in range(start, end + 1):
                left = burst(start, i - 1)
                right = burst(i + 1, end)
                coins = nums[i] * (nums[start - 1] if start > 0 else 1) * (nums[end + 1] if end < len(nums) - 1 else 1)
                max_coins = max(max_coins, left + right + coins)
            memo[(start, end)] = max_coins
            return max_coins
        
        n = len(nums)
        memo = {}
        return burst(0, n - 1)
