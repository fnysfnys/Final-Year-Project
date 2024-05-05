class Solution(object):
    def canPartition(self, nums):
        total_sum = sum(nums)
        if total_sum % 2 != 0:
            return False
        target_sum = total_sum // 2
        n = len(nums)
        dp = [False] * (1 << n)
        dp[0] = True
        
        for mask in range(1, 1 << n):
            curr_sum = 0
            for i in range(n):
                if mask & (1 << i):
                    curr_sum += nums[i]
            dp[mask] = dp[mask ^ (1 << i)] or (curr_sum == target_sum)
        
        return dp[(1 << n) - 1]
