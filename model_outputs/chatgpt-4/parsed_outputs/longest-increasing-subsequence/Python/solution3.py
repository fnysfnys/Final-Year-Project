class Solution(object):
    def lengthOfLIS(self, nums):
        """
        Given an integer array nums, return the length of the longest alternating (increasing and decreasing) subsequence.
        
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0
    
        up = [1] * len(nums)
        down = [1] * len(nums)
    
        for i in range(1, len(nums)):
            for j in range(i):
                if nums[i] > nums[j]:
                    up[i] = max(up[i], down[j] + 1)
                elif nums[i] < nums[j]:
                    down[i] = max(down[i], up[j] + 1)
    
        return max(max(up), max(down))
    
