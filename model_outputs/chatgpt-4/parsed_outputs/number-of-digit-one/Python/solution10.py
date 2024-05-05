class Solution(object):
    def countDigitOne(self, n):
        """
        Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
        """
        count, factor = 0, 1
        while factor <= n:
            count += (n // (factor * 10)) * factor + min(max(n % (factor * 10) - factor + 1, 0), factor)
            factor *= 10
        return count