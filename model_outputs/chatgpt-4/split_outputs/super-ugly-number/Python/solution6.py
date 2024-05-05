class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
        """
        ... [Docstring as above] ...
        """
        ugly_numbers = [1]
        for _ in range(1, n):
            next_ugly = min(x * ugly_numbers[-1] for x in primes if x * ugly_numbers[-1] not in ugly_numbers)
            ugly_numbers.append(next_ugly)
        return ugly_numbers[n - 1]
