class Solution(object):
    def maxCoins(self, nums):
        """
        Recursive divide and conquer approach.
        Time complexity: O(3^n)
        Space complexity: O(n)
        """
        n = len(nums)
        nums = [1] + nums + [1]

        def divide_and_conquer(left, right):
            if left + 1 == right:
                return 0

            max_coins = 0
            for k in range(left + 1, right):
                coins = nums[left] * nums[k] * nums[right] + divide_and_conquer(left, k) + divide_and_conquer(k, right)
                max_coins = max(max_coins, coins)

            return max_coins

        return divide_and_conquer(0, n + 1)
