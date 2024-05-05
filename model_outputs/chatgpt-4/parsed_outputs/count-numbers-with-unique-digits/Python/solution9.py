class Solution(object):
    def countNumbersWithUniqueDigits(self, n):
        """
        [Same docstring as provided]
        """
        def count(start, n):
            if n == 0:
                return 1
            total = 0
            for i in range(start, 10):
                total += count(i + 1, n - 1)
            return total

        return sum(count(0, i) for i in range(n + 1))