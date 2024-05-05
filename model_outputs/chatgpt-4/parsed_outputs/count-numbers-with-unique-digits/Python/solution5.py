class Solution(object):
    def countNumbersWithUniqueDigits(self, n):
        """
        [Same docstring as provided]
        """
        def countUniqueDigits(length, bitmask):
            if length == 0:
                return 1
            total = 0
            for i in range(10):
                if bitmask & (1 << i) == 0:
                    total += countUniqueDigits(length - 1, bitmask | (1 << i))
            return total

        return sum(countUniqueDigits(i, 0) for i in range(n + 1))