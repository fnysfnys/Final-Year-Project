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
        
        tails = [0] * len(nums)
        size = 0
        
        for num in nums:
            left, right = 0, size
            while left < right:
                mid = left + (right - left) // 2
                if tails[mid] < num:
                    left = mid + 1
                else:
                    right = mid
            tails[left] = num
            if left == size:
                size += 1
        
        return size