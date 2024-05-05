class Solution(object):
    def integerReplacement(self, n):
        # Docstring here

        memo = {}
        def helper(n):
            if n == 1:
                return 0
            if n not in memo:
                if n % 2 == 0:
                    memo[n] = 1 + helper(n // 2)
                else:
                    memo[n] = 1 + min(helper(n + 1), helper(n - 1))
            return memo[n]

        return helper(n)