class Solution:
    def maxCoins(self, nums):
        """ Implement using Python generators for a more Pythonic approach. """
        nums = [1] + nums + [1]

        def generate_combinations(left, right):
            if left + 1 == right:
                yield 0
            for i in range(left + 1, right):
                yield (nums[left] * nums[i] * nums[right] +
                       max(generate_combinations(left, i)) +
                       max(generate_combinations(i, right)))

        return max(generate_combinations(0, len(nums) - 1))
