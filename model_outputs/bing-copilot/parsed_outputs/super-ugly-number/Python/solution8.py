class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
        ugly = [1]
        exponents = [0] * len(primes)
        while len(ugly) < n:
            next_ugly = min(ugly[i] * primes[j] for i, j in enumerate(exponents))
            ugly.append(next_ugly)
            for i, j in enumerate(exponents):
                if ugly[i] * primes[j] == next_ugly:
                    exponents[i] += 1
        return ugly[-1]
