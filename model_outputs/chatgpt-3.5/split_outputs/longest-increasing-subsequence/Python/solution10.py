from itertools import combinations

class Solution(object):
    def lengthOfLIS(self, nums):
        """
        Given an integer array nums, return the length of the longest strictly increasing subsequence.
        
        ... (same docstring as provided)
        
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0
        
        max_length = 0
        for r in range(1, len(nums) + 1):
            for combo in combinations(nums, r):
                if list(combo) == sorted(list(combo)):
                    max_length = max(max_length, r)
        
        return max_length
