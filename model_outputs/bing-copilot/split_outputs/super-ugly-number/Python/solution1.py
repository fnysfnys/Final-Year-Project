import heapq

class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
        heap = [1]
        seen = set([1])
        for _ in range(n):
            ugly = heapq.heappop(heap)
            for prime in primes:
                next_ugly = ugly * prime
                if next_ugly not in seen:
                    seen.add(next_ugly)
                    heapq.heappush(heap, next_ugly)
        return ugly
