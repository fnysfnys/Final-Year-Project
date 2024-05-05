class Solution(object):
    def lengthOfLIS(self, nums):
        """
        Given an integer array nums, return the length of the longest strictly increasing subsequence.
        
        ... (same docstring as provided)
        
        :type nums: List[int]
        :rtype: int
        """
        def lis_helper(nums, prev, current):
            if current == len(nums):
                return 0
            taken = 0
            if nums[current] > prev:
                taken = 1 + lis_helper(nums, nums[current], current + 1)
            not_taken = lis_helper(nums, prev, current + 1)
            return max(taken, not_taken)
        
        return lis_helper(nums, float('-inf'), 0)