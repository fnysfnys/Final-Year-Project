class Solution(object):
    def canPartition(self, nums):
        total_sum = sum(nums)
        if total_sum % 2 != 0:
            return False
        target_sum = total_sum // 2
        n = len(nums)
        dp = [False] * (target_sum + 1)
        dp[0] = True
        
        for num in nums:
            for j in range(target_sum, num - 1, -1):
                dp[j] = dp[j] or dp[j - num]
        
        return dp[target_sum]
