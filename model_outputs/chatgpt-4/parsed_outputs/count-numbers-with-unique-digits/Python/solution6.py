class Solution(object):
    def countNumbersWithUniqueDigits(self, n):
        """
        [Same docstring as provided]
        """
        from math import factorial

        def permute(m, r):
            return factorial(m) // factorial(m - r)

        return sum(permute(10 if i else 9, i) for i in range(n + 1))