class Solution(object):
    def integerBreak(self, n):
        if n <= 3:
            return n - 1
        exp3 = n // 3
        remainder = n % 3
        if remainder == 0:
            return 3 ** exp3
        elif remainder == 1:
            return 3 ** (exp3 - 1) * 4
        else:
            exp2 = (n - 2 * exp3) // 2
            return 3 ** exp3 * 2 ** exp2
