class Solution:
    def maxCoins(self, nums):
        """ Use recursion with memoization. """
        nums = [1] + nums + [1]
        memo = {}

        def burst(left, right):
            if left + 1 == right:
                return 0
            if (left, right) in memo:
                return memo[(left, right)]

            best = 0
            for i in range(left + 1, right):
                coins = nums[left] * nums[i] * nums[right]
                coins += burst(left, i) + burst(i, right)
                best = max(best, coins)

            memo[(left, right)] = best
            return best

        return burst(0, len(nums) - 1)