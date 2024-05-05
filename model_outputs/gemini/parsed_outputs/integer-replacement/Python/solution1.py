class Solution(object):
    def integerReplacement(self, n, memo={}):
        if n in memo:
            return memo[n]
        if n == 1:
            return 0
        if n % 2 == 0:
            memo[n] = 1 + self.integerReplacement(n // 2, memo)
        else:
            memo[n] = 1 + min(self.integerReplacement(n + 1, memo), self.integerReplacement(n - 1, memo))
        return memo[n]
