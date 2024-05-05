class Solution(object):
    def countDigitOne(self, n):
        """
        Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
        """
        count, i = 0, 1
        while i <= n:
            divider = i * 10
            count += (n // divider) * i + min(max(n % divider - i + 1, 0), i)
            i *= 10
        return count