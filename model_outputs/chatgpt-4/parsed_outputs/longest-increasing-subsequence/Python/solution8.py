class Solution(object):
    def lengthOfLIS(self, nums):
        """
        Given an integer array nums, return the length of the longest strictly increasing subsequence with unique elements.
        
        :type nums: List[int]
        :rtype: int
        """
        nums = list(dict.fromkeys(nums))  # Remove duplicates
        if not nums:
            return 0
    
        dp = [1] * len(nums)
        for i in range(1, len(nums)):
            for j in range(i):
                if nums[i] > nums[j]:
                    dp[i] = max(dp[i], dp[j] + 1)
        return max(dp)
    
