import heapq

class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
        heap = [1]
        for _ in range(n):
            ugly = heapq.heappop(heap)
            for prime in primes:
                heapq.heappush(heap, ugly * prime)
        return ugly
