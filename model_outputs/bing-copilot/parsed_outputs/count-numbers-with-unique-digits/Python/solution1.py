class Solution(object):
    def countNumbersWithUniqueDigits(self, n):
        if n == 0:
            return 1
        total_count = 10  # Single-digit numbers
        unique_digits = 9
        for i in range(2, n + 1):
            unique_digits *= (11 - i)
            total_count += unique_digits
        return total_count
