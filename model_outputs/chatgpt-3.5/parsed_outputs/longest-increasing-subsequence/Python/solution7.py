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
        
        lis = []
        for num in nums:
            left, right = 0, len(lis) - 1
            while left <= right:
                mid = left + (right - left) // 2
                if lis[mid] < num:
                    left = mid + 1
                else:
                    right = mid - 1
            if left < len(lis):
                lis[left] = num
            else:
                lis.append(num)
        
        return len(lis)