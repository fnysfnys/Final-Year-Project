class Solution(object):
    def splitArray(self, nums, k):
        """
        Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
        Return the minimized largest sum of the split.
        A subarray is a contiguous part of the array.
        """
        n = len(nums)
        memo = {}

        def dfs(start, k):
            if (start, k) in memo:
                return memo[(start, k)]
            
            if k == 1:
                return sum(nums[start:])
            
            min_max_sum = float('inf')
            current_sum = 0

            for end in range(start, n - k + 2):
                current_sum += nums[end]
                next_max_sum = max(current_sum, dfs(end + 1, k - 1))
                min_max_sum = min(min_max_sum, next_max_sum)

            memo[(start, k)] = min_max_sum
            return min_max_sum
        
        return dfs(0, k)