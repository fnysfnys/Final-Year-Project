class Solution(object):
    def lengthOfLIS(self, nums):
        """
        Given an integer array nums, return the length of the longest bitonic subsequence (first increasing then decreasing).
        
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0
    
        increase = [1] * len(nums)
        decrease = [1] * len(nums)
    
        for i in range(len(nums)):
            for j in range(i):
                if nums[i] > nums[j]:
                    increase[i] = max(increase[i], increase[j] + 1)
    
        for i in reversed(range(len(nums))):
            for j in range(i + 1, len(nums)):
                if nums[i] > nums[j]:
                    decrease[i] = max(decrease[i], decrease[j] + 1)
    
        lbs = [increase[i] + decrease[i] - 1 for i in range(len(nums))]
        return max(lbs)
    
