class Solution(object):
    def integerBreak(self, n):
        if n <= 3:
            return n - 1
        exp = n // 3
        remainder = n % 3
        if remainder == 0:
            return 3 ** exp
        elif remainder == 1:
            return 3 ** (exp - 1) * 4
        else:
            return 3 ** exp * 2
