class Solution(object):
    def integerReplacement(self, n):
        """
        Given a positive integer n, you can apply one of the following operations:

        If n is even, replace n with n / 2.
        If n is odd, replace n with either n + 1 or n - 1.

        Return the minimum number of operations needed for n to become 1.

        :type n: int
        :rtype: int
        """
        dp = [0] * (n + 1)
        
        for i in range(2, n + 1):
            if i % 2 == 0:
                dp[i] = dp[i // 2] + 1
            else:
                dp[i] = min(dp[i - 1], dp[(i + 1) // 2] + 1) + 1
                
        return dp[n]