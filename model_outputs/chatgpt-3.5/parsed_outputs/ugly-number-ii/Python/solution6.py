class Solution(object):
    def nthUglyNumber(self, n):
        """
        An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
        Given an integer n, return the nth ugly number.
        """
        ugly_numbers = [1]
        i = 2

        while len(ugly_numbers) < n:
            if i % 2 == 0 or i % 3 == 0 or i % 5 == 0:
                ugly_numbers.append(i)
            i += 1

        return ugly_numbers[-1]