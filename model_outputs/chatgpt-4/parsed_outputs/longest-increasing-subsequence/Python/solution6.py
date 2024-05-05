class Solution(object):
    def lengthOfLIS(self, nums):
        """
        Given an integer array nums, return the length of the shortest strictly increasing subsequence.
        
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0
    
        dp = [1] * len(nums)
        for i in range(1, len(nums)):
            for j in range(i):
                if nums[i] > nums[j]:
                    dp[i] = min(dp[i], dp[j] + 1)
    
        return min(dp)
    
