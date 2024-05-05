class Solution(object):
    def nthUglyNumber(self, n):
        """
        An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
        Given an integer n, return the nth ugly number.
        """
        ugly_numbers = [1]
        i, j, k = 0, 0, 0

        while len(ugly_numbers) < n:
            next_ugly = min(ugly_numbers[i] * 2, ugly_numbers[j] * 3, ugly_numbers[k] * 5)
            ugly_numbers.append(next_ugly)

            if next_ugly == ugly_numbers[i] * 2:
                i += 1
            if next_ugly == ugly_numbers[j] * 3:
                j += 1
            if next_ugly == ugly_numbers[k] * 5:
                k += 1

        return ugly_numbers[-1]