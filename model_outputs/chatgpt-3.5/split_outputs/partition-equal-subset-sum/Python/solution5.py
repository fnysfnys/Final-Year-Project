class Solution(object):
    def canPartition(self, nums):
        """
        Using bitmasking to check if it's possible to partition the array into two subsets with equal sums.
        """
        total_sum = sum(nums)
        if total_sum % 2 != 0:
            return False
        
        half_sum = total_sum // 2
        dp = [False] * (1 << len(nums))
        dp[0] = True
        
        for i in range(1, 1 << len(nums)):
            subset_sum = 0
            for j in range(len(nums)):
                if (i >> j) & 1:
                    subset_sum += nums[j]
            dp[i] = dp[i] or (subset_sum == half_sum)
        
        return dp[(1 << len(nums)) - 1]
