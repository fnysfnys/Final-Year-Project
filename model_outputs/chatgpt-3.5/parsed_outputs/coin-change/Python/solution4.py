from collections import deque

class Solution(object):
    def coinChange(self, coins, amount):
        """
        You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
        Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
        You may assume that you have an infinite number of each kind of coin.
        """
        if amount == 0:
            return 0
        queue = deque([(amount, 0)])
        visited = set()
        while queue:
            remaining, num_coins = queue.popleft()
            if remaining == 0:
                return num_coins
            if remaining not in visited:
                visited.add(remaining)
                for coin in coins:
                    if remaining - coin >= 0:
                        queue.append((remaining - coin, num_coins + 1))
        return -1