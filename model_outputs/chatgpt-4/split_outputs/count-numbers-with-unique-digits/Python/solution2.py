class Solution(object):
    def countNumbersWithUniqueDigits(self, n):
        """
        [Same docstring as provided]
        """
        if n == 0:
            return 1
        count, factorial = 10, 9
        for i in range(2, n + 1):
            factorial *= 11 - i
            count += factorial
        return count
