class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
        """
        ... [Docstring as above] ...
        """
        ugly_numbers = [1] + [float('inf')] * (n - 1)
        indices = [0] * len(primes)

        for i in range(1, n):
            for j in range(len(primes)):
                ugly_numbers[i] = min(ugly_numbers[i], primes[j] * ugly_numbers[indices[j]])
            for j in range(len(primes)):
                if ugly_numbers[i] == primes[j] * ugly_numbers[indices[j]]:
                    indices[j] += 1

        return ugly_numbers[n - 1]