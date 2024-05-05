class Solution(object):
    def combinationSum4(self, nums, target):
        """
        Given an array of distinct integers nums and a target integer target, return the number of possible combinations that add up to target.
        The test cases are generated so that the answer can fit in a 32-bit integer.
        """
        dp = [0] * (target + 1)
        dp[0] = 1
        
        for num in nums:
            for i in range(num, target + 1):
                dp[i] += dp[i - num]
        
        return dp[target]