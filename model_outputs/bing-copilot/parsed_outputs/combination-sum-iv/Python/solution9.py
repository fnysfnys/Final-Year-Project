import numpy as np

class Solution(object):
    def combinationSum4(self, nums, target):
        dp = np.zeros(target + 1, dtype=int)
        dp[0] = 1
        for i in range(1, target + 1):
            for num in nums:
                if i >= num:
                    dp[i] += dp[i - num]
        return dp[target]
