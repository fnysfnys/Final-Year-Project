class Solution(object):
    def countNumbersWithUniqueDigits(self, n):
        if n == 0:
            return 1
        return 9 * sum(9 * (10 - i) for i in range(n - 1)) + 10
