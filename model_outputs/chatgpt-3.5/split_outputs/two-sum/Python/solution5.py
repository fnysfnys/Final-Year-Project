class Solution(object):
    def twoSum(self, nums, target):
        """
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.
        """
        return [i for i, x in enumerate(nums) if (target - x) in nums[i + 1:]][0], [i for i, x in enumerate(nums) if x == (target - nums[i])][0]
