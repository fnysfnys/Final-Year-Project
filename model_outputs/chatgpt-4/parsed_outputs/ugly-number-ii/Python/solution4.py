class Solution(object):
    def nthUglyNumber(self, n):
        """
        (docstring as provided)
        """
        def helper(n, memo):
            if n in memo:
                return memo[n]
            memo[n] = min(helper(n // 2, memo) * 2, helper(n // 3, memo) * 3, helper(n // 5, memo) * 5)
            return memo[n]

        memo = {1: 1}
        return helper(n, memo)