class Solution:
    def countNumbersWithUniqueDigits(self, n: int) -> int:
        if n == 0:
            return 1
        dp = [1] + [9] * n
        for k in range(2, n + 1):
            for i in range(1, k):
                dp[k] *= (9 - i + 2)  # Account for 0-leading numbers
        return sum(dp)
