class Solution(object):
    def coinChange(self, coins, amount):
        def binary_search(target):
            left, right = 0, len(coins) - 1
            while left <= right:
                mid = left + (right - left) // 2
                if coins[mid] == target:
                    return 1
                elif coins[mid] < target:
                    left = mid + 1
                else:
                    right = mid - 1
            return float('inf')
        
        coins.sort()
        dp = [float('inf')] * (amount + 1)
        dp[0] = 0
        for i in range(1, amount + 1):
            for coin in coins:
                if i >= coin:
                    dp[i] = min(dp[i], dp[i - coin] + 1)
        return dp[amount] if dp[amount] != float('inf') else -1
