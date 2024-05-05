class Solution(object):
    def combinationSum4(self, nums, target):
        total_combinations = 1
        for num in nums:
            total_combinations *= (target // num)
        return total_combinations
