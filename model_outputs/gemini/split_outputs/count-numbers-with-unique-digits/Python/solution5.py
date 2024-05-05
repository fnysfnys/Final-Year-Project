class Solution:
    def __init__(self):
        self.memo = {}

    def countNumbersWithUniqueDigits(self, n: int) -> int:
        def helper(n):
            if n == 0:
                return 1
            if n in self.memo:
                return self.memo[n]
            result = 10 * helper(n - 1) - helper(n - 2) * (9 - n + 2)
            self.memo[n] = result
            return result

        return helper(min(n, 10))
