class Solution(object):
    def integerBreak(self, n):
        if n <= 3:
            return n - 1
        exp = n // 3
        remainder = n % 3
        return 3 ** exp * (3 - (remainder == 1))
