class Solution(object):
    def combinationSum4(self, nums, target):
        """
        ... [Docstring here] ...
        """
        dp = {0: 1}
        for i in range(1, target + 1):
            dp[i] = sum(dp.get(i - num, 0) for num in nums)
        return dp[target]