class Solution(object):
    def integerBreak(self, n):
        """
        (Docstring as provided)
        """
        memo = {}

        def break_integer(x):
            if x in memo:
                return memo[x]
            if x <= 3:
                return x
            result = 0
            for i in range(1, x):
                result = max(result, i * break_integer(x - i))
            memo[x] = result
            return result

        return break_integer(n) if n > 3 else n - 1
