import heapq

class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
        heap = [1]
        for _ in range(n):
            ugly = heapq.heappop(heap)
            for prime in primes:
                next_ugly = ugly * prime
                heapq.heappush(heap, next_ugly)
        return ugly
