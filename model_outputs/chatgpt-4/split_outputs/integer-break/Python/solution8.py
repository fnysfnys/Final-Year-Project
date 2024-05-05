class Solution(object):
    def integerBreak(self, n):
        """
        (Docstring as provided)
        """
        if n <= 3:
            return n - 

1
        if n % 3 == 0:
            return 3 ** (n // 3)
        if n % 3 == 1:
            return 3 ** ((n // 3) - 1) * 4
        return 3 ** (n // 3) * 2
