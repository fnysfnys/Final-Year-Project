class Solution(object):
    def maxCoins(self, nums):
        """
        Brute force recursive solution.
        Time complexity: O(2^n)
        Space complexity: O(n)
        """
        def burst(nums):
            if not nums:
                return 0
            max_coins = 0
            for i in range(len(nums)):
                coins = nums[i] * (nums[i - 1] if i - 1 >= 0 else 1) * (nums[i + 1] if i + 1 < len(nums) else 1)
                new_nums = nums[:i] + nums[i + 1:]
                max_coins = max(max_coins, coins + burst(new_nums))
            return max_coins

        return burst(nums)