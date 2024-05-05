class Solution(object):
    def splitArray(self, nums, k):
        """
        Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
        Return the minimized largest sum of the split.
        A subarray is a contiguous part of the array.
        """
        n = len(nums)
        dp = [[0] * (k + 1) for _ in range(n + 1)]
        
        for i in range(1, n + 1):
            dp[i][1] = dp[i - 1][1] + nums[i - 1]
        
        for i in range(1, n + 1):
            for j in range(2, k + 1):
                min_sum = float('inf')
                for p in range(i):
                    min_sum = min(min_sum, max(dp[p][j - 1], dp[i][1] - dp[p][1]))
                dp[i][j] = min_sum
        
        return dp[n][k]
