class Solution(object):
    def countDigitOne(self, n):
        """
        Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
        """
        if n <= 0:
            return 0
        if n < 10:
            return 1 if n >= 1 else 0
        last = int(str(n)[1:])
        return self.countDigitOne(last) + self.countDigitOne(n // 10) * (last + 1) + (n // 10)