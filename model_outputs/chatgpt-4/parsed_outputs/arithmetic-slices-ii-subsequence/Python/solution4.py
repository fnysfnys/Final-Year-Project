class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        """
        [Docstring from the provided code snippet]
        """
        count = 0
        dp = [{} for _ in nums]
        for i in range(len(nums)):
            for j in range(i):
                diff = nums[i] - nums[j]
                dp[i][diff] = dp[i].get(diff, 0) + dp[j].get(diff, 1)
                count += dp[j].get(diff, 0)
        return count