class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        """
        Given an integer array nums, return the number of all the arithmetic subsequences of nums.
        A sequence of numbers is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
        ...
        :type nums: List[int]
        :rtype: int
        """
        count = 0
        for i in range(len(nums) - 2):
            if nums[i+2] - nums[i+1] == nums[i+1] - nums[i]:
                count += 1
        return count