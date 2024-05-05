class Solution:
    def countNumbersWithUniqueDigits(self, n: int) -> int:
        if n == 0:
            return 1
        choices = 9
        available = 9
        result = 10  # Account for single-digit numbers
        for _ in range(1, n):
            result += choices * available
            choices *= available
            available -= 1
        return result
