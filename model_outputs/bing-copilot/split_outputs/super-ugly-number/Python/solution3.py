class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
        ugly = [1]
        seen = set([1])
        while len(ugly) < n:
            next_ugly = min(ugly[i] * prime for prime in primes for i in range(len(ugly)))
            if next_ugly not in seen:
                seen.add(next_ugly)
                ugly.append(next_ugly)
        return ugly[-1]
