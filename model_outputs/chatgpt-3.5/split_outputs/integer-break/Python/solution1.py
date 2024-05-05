class Solution(object):
    def integerBreak(self, n):
        """
        Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.
        Return the maximum product you can get.
        
        Example 1:
        Input: n = 2
        Output: 1
        Explanation: 2 = 1 + 1, 1 × 1 = 1.
        
        Example 2:
        Input: n = 10
        Output: 36
        Explanation: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36.
        
        Constraints:
        2 <= n <= 58
        
        :type n: int
        :rtype: int
        """
        if n <= 2:
            return 1
        dp = [0] * (n + 1)
        dp[2] = 1
        for i in range(3, n + 1):
            for j in range(1, i):
                dp[i] = max(dp[i], max(j, dp[j]) * max(i - j, dp[i - j]))
        return dp[n]
