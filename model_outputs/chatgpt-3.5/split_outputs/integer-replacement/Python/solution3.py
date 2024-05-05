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
        memo = {}
        
        def helper(n):
            if n == 1:
                return 0
            if n in memo:
                return memo[n]
            if n % 2 == 0:
                memo[n] = 1 + helper(n // 2)
            else:
                memo[n] = 1 + min(helper(n + 1), helper(n - 1))
            return memo[n]
        
        return helper(n)
