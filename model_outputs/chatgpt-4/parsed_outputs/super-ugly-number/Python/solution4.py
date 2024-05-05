class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
        """
        ... [Docstring as above] ...
        """
        ugly_numbers = [1]
        indices = [0] * len(primes)

        for _ in range(1, n):
            next_uglies = [primes[i] * ugly_numbers[indices[i]] for i in range(len(primes))]
            next_ugly = min(next_uglies)
            ugly_numbers.append(next_ugly)

            for i in range(len(primes)):
                if next_uglies[i] == next_ugly:
                    indices[i] += 1

        return ugly_numbers[-1]