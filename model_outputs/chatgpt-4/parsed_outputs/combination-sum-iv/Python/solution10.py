class Solution(object):
    def combinationSum4(self, nums, target):
        """
        ... [Docstring here] ...
        """
        dp = [0] * (target + 1)
        dp[0] = 1
        for i in range(1, target + 1):
            dp[i] = sum(dp[i - num] for num in nums if i >= num)
        return dp[target]