class Solution:
    def maxCoins(self, nums):
        """ Brute force approach, not recommended for large inputs. """
        nums = [1] + nums + [1]

        def maxCoinsHelper(sequence):
            if len(sequence) == 2:
                return 0
            max_coins = 0
            for i in range(1, len(sequence) - 1):
                coins = sequence[i - 1] * sequence[i] * sequence[i + 1]
                coins += maxCoinsHelper(sequence[:i] + sequence[i + 1:])
                max_coins = max(max_coins, coins)
            return max_coins

        return maxCoinsHelper(nums)
