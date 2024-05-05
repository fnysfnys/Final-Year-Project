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
        subsequences = set()
        
        for i in range(n):
            for j in range(i + 2, n):
                if nums[j] - nums[i] == (j - i) * (nums[i+1] - nums[i]):
                    subsequences.add(tuple(nums[i:j+1]))
        
        return len(subsequences)