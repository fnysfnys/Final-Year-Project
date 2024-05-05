import itertools

class Solution(object):
    def maxCoins(self, nums):
        """
        Using itertools.combinations.
        Time complexity: O(2^n)
        Space complexity: O(n)
        """
        nums = [1] + nums + [1]
        max_coins = 0

        for k in range(1, len(nums) - 1):
            for combo in itertools.combinations(range(1, len(nums) - 1), k):
                coins = 0
                for i in combo:
                    coins += nums[i - 1] * nums[i] * nums[i + 1]
                max_coins = max(max_coins, coins)

        return max_coins
