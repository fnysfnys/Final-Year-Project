from itertools import permutations

class Solution(object):
    def maxCoins(self, nums):
        def calculate(coins):
            total = 0
            for i in range(len(coins)):
                left = coins[i - 1] if i > 0 else 1
                right = coins[i + 1] if i < len(coins) - 1 else 1
                total += left * coins[i] * right
            return total
        
        max_coins = 0
        for perm in permutations(nums):
            max_coins = max(max_coins, calculate(perm))
        return max_coins
