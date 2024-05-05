class Solution(object):
    def nthUglyNumber(self, n):
        """
        An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
        Given an integer n, return the nth ugly number.
        """
        def generate_ugly_numbers():
            ugly_numbers = [1]
            i, j, k = 0, 0, 0

            while True:
                next_ugly = min(ugly_numbers[i] * 2, ugly_numbers[j] * 3, ugly_numbers[k] * 5)
                yield next_ugly

                if next_ugly == ugly_numbers[i] * 2:
                    i += 1
                if next_ugly == ugly_numbers[j] * 3:
                    j += 1
                if next_ugly == ugly_numbers[k] * 5:
                    k += 1

        gen = generate_ugly_numbers()
        for _ in range(n - 1):
            next(gen)

        return next(gen)
