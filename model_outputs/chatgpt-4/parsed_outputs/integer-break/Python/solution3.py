class Solution(object):
    def integerBreak(self, n):
        """
        (Docstring as provided)
        """
        if n <= 3:
            return n - 1
        product = 1
        while n > 4:
            product *= 3
            n -= 3
        product *= n
        return product