class Solution(object):
    def combinationSum4(self, nums, target):
        """
        ... [Docstring here] ...
        """
        dp = [0] * (target + 1)
        dp[0] = 1
        for i in range(target + 1):
            for num in nums:
                if i + num <= target:
                    dp[i + num] += dp[i]
        return dp[target]
