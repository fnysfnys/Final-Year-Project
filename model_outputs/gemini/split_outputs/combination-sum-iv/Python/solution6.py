class Solution:
    def combinationSum4(self, nums, target):
        dp = [[0] * (target + 1) for _ in range(len(nums))]
        for i in range(len(nums)):
            dp[i][0] = 1
            for j in range(1, target + 1):
                if nums[i] <= j:
                    dp[i][j] = dp[i - 1][j] + dp[i][j - nums[i]]
                else:
                    dp[i][j] = dp[i - 1][j]
        return sum(dp[-1])
