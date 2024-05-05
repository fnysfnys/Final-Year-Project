class Solution(object):
    def integerBreak(self, n):
        if n <= 3:
            return n - 1
        exp = int(math.log(n, 3))
        if 3 ** exp == n:
            return 3 ** exp
        elif 3 ** exp * 2 == n:
            return 3 ** exp * 2
        else:
            return 3 ** (exp - 1) * (n - 3 * (exp - 1))
