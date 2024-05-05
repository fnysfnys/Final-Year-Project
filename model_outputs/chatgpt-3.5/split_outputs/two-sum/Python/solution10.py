class Solution(object):
    def twoSum(self, nums, target):
        """
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.
        """
        return next((i for i, (x, y) in enumerate(zip(nums, nums[1:])) if x + y == target), None), next((i+1 for i, (x, y) in enumerate(zip(nums, nums[1:])) if

 x + y == target), None)
