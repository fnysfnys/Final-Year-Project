class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
        ugly = [1] * n
        pointers = [0] * len(primes)
        for i in range(1, n):
            next_ugly = min(ugly[pointers[j]] * primes[j] for j in range(len(primes)))
            ugly[i] = next_ugly
            for j in range(len(primes)):
                if ugly[pointers[j]] * primes[j] == next_ugly:
                    pointers[j] += 1
        return ugly[-1]
