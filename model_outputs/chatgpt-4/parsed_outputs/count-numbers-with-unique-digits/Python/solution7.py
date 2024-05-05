class Solution(object):
    def countNumbersWithUniqueDigits(self, n):
        """
        [Same docstring as provided]
        """
        if n == 0: return 1
        total, product = 10, 9
        for i in range(1, min(n, 10)):
            product *= 10 - i
            total += product
        return total