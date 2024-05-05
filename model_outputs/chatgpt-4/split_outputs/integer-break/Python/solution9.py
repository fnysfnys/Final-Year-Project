class Solution(object):
    def integerBreak(self, n):
        """
        (Docstring as provided)
        """
        if n <= 3:
            return n - 1

        def helper(x):
            if x == 2:
                return 2
            if x == 3:
                return 3
            return max(2 * helper(x - 2), 3 * helper(x - 3))

        return helper(n)
