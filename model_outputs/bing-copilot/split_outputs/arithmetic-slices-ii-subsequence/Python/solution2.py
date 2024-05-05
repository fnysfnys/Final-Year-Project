class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        n = len(nums)
        dp = [0] * n
        total = 0
        for i in range(2, n):
            if nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]:
                dp[i] = dp[i - 1] + 1
                total += dp[i]
        return total
