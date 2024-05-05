class Solution:
    def maxCoins(self, nums):
        """ Implement a greedy approach, which is not optimal but heuristic. """
        nums = [1] + nums + [1]
        coins = 0

        while len(nums) > 2:
            min_idx = nums.index(min(nums[1:-1]))
            coins += nums[min_idx - 1] * nums[min_idx] * nums[min_idx + 1]
            nums.pop(min_idx)

        return coins
