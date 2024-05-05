class Solution(object):
    def countDigitOne(self, n):
        """
        Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
        """
        count, factor, digit = 0, 1, n
        while digit > 0:
            digit, remainder = divmod(n, factor * 10)
            count += digit * factor
            if remainder >= factor:
                count += min(remainder - factor + 1, factor)
            factor *= 10
        return count
