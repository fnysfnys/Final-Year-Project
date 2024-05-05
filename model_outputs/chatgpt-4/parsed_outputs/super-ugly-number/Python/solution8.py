import heapq

class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
        """
        ... [Docstring as above] ...
        """
        heap = [1]
        seen = {1}

        for _ in range(n):
            ugly = heapq.heappop(heap)
            if len(seen) >= n:
                break
            for prime in primes:
                next_ugly = ugly * prime
                if next_ugly not in seen:
                    heapq.heappush(heap, next_ugly)
                    seen.add(next_ugly)

        return ugly