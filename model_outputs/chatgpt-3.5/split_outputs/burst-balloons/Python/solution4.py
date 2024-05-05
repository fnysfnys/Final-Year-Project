import itertools

class Solution(object):
    def maxCoins(self, nums):
        """
        Using itertools.permutations.
        Time complexity: O(n!)
        Space complexity: O(n)
        """
        nums = [1] + nums + [1]
        max_coins = 0

        for perm in itertools.permutations(nums[1:-1]):
            coins = 0
            nums_copy = [1] + list(perm) + [1]
            for i in range(1, len(nums_copy) - 1):
                coins += nums_copy[i - 1] * nums_copy[i] * nums_copy[i + 1]
            max_coins = max(max_coins, coins)

        return max_coins
