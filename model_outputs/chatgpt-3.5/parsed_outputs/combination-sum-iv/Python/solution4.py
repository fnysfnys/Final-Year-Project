from itertools import product

class Solution(object):
    def combinationSum4(self, nums, target):
        """
        Given an array of distinct integers nums and a target integer target, return the number of possible combinations that add up to target.
        The test cases are generated so that the answer can fit in a 32-bit integer.
        """
        count = 0
        for combo in product(nums, repeat=target):
            if sum(combo) == target:
                count += 1
        return count