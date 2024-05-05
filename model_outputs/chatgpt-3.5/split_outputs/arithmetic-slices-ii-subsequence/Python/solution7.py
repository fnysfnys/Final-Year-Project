class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        """
        Given an integer array nums, return the number of all the arithmetic subsequences of nums.
        A sequence of numbers is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
        ...
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        count = 0
        unique_diffs = [set() for _ in range(n)]
        
        for i in range(n):
            for j in range(i):
                diff = nums[i] - nums[j]
                if diff in unique_diffs[j]:
                    count += 1
                    unique_diffs[i].add(diff)
                else:
                    unique_diffs[j].add(diff)
        
        return count
