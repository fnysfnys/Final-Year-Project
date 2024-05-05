class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
        ugly = [1] * n
        pointers = [0] * len(primes)
        for i in range(1, n):
            next_ugly = float('inf')
            for j in range(len(primes)):
                next_candidate = ugly[pointers[j]] * primes[j]
                next_ugly = min(next_ugly, next_candidate)
            ugly[i] = next_ugly
            for j in range(len(primes)):
                if ugly[pointers[j]] * primes[j] == next_ugly:
                    pointers[j] += 1
        return ugly[-1]
