class Solution(object):
    def canPartition(self, nums):
        """
        Dynamic programming solution to check if it's possible to partition the array into two subsets with equal sums.
        """
        total_sum = sum(nums)
        if total_sum % 2 != 0:
            return False
        
        half_sum = total_sum // 2
        dp = [False] * (half_sum + 1)
        dp[0] = True
        
        for num in nums:
            for i in range(half_sum, num - 1, -1):
                dp[i] = dp[i] or dp[i - num]
        
        return dp[half_sum]
