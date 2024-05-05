class Solution(object):
    def splitArray(self, nums, k):
        """
        Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
        Return the minimized largest sum of the split.
        A subarray is a contiguous part of the array.
        """
        memo = {}
        
        def dfs(nums, k, start):
            if (k, start) in memo:
                return memo[(k, start)]
            
            if k == 1:
                return sum(nums[start:])
            
            min_max_sum = float('inf')
            current_sum = 0
            
            for end in range(start, len(nums) - k + 1):
                current_sum += nums[end]
                next_max_sum = max(current_sum, dfs(nums, k - 1, end + 1))
                min_max_sum = min(min_max_sum, next_max_sum)
            
            memo[(k, start)] = min_max_sum
            return min_max_sum
        
        return dfs(nums, k, 0)
