class Solution(object):
    def canPartition(self, nums):
        totalSum = sum(nums)
        if totalSum % 2 != 0:
            return False
        target = totalSum // 2
        dp = [[False] * (target + 1) for _ in range(len(nums) + 1)]
        dp[0][0] = True
        for i in range(1, len(nums) + 1):
            for j in range(1, target + 1):
                dp[i][j] = dp[i-1][j] or (j >= nums[i-1] and dp[i-1][j-nums[i-1]])
        return dp[-1][-1]
