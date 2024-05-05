from itertools import combinations

class Solution(object):
    def twoSum(self, nums, target):
        """
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.
        """
        for indices in combinations(range(len(nums)), 2):
            if nums[indices[0]] + nums[indices[1]] == target:
                return list(indices)