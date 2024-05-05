class Solution(object):
    def countDigitOne(self, n):
        """
        Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
        """
        count = 0
        for num in range(1, n + 1):
            while num:
                count += num % 10 == 1
                num //= 10
        return count
