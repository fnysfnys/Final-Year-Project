class Solution(object):
    def lengthOfLIS(self, nums):
        """
        Given an integer array nums, return the length of the longest subsequence where all elements are equal.
        
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0
    
        count = {}
        for num in nums:
            count[num] = count.get(num, 0) + 1
    
        return max(count.values())
    
