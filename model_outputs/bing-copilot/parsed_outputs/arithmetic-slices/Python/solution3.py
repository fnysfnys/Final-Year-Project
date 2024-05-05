class Solution:
    def numberOfArithmeticSlices(self, nums):
        n = len(nums)
        dp = [0] * n
        total_slices = 0
        for i in range(2, n):
            if nums[i] - nums[i-1] == nums[i-1] - nums[i-2]:
                dp[i] = dp[i-1] + 1
                total_slices += dp[i]
        return total_slices
