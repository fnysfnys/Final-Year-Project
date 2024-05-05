class Solution(object):
    def countDigitOne(self, n):
        """
        Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
        """
        return sum(str(i).count('1') for i in range(1, n + 1))
