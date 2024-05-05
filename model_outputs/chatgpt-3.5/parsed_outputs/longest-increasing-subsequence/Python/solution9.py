import heapq

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
            index = bisect.bisect_left(lis, num)
            if index == len(lis):
                lis.append(num)
            else:
                lis[index] = num
        
        return len(lis)