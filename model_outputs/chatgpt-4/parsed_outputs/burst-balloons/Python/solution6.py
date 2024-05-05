class Solution:
    def maxCoins(self, nums):
        """ Use a divide and conquer approach. """
        nums = [1] + nums + [1]
        memo = {}

        def maxCoinsHelper(left, right):
            if left + 1 == right:
                return 0
            if (left, right) in memo:
                return memo[(left, right)]

            max_coins = 0
            for i in range(left + 1, right):
                coins = nums[left] * nums[i] * nums[right]
                coins += maxCoinsHelper(left, i) + maxCoinsHelper(i, right)
                max_coins = max(max_coins, coins)

            memo[(left, right)] = max_coins
            return max_coins

        return maxCoinsHelper(0, len(nums) - 1)