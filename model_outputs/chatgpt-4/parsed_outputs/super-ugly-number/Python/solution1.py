import heapq

class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
        """
        ... [Docstring as above] ...
        """
        ugly_numbers = [1]
        seen = {1}
        heap = [(prime, prime, 1) for prime in primes]  # (value, prime, index)

        for _ in range(n - 1):
            val, prime, index = heapq.heappop(heap)
            next_ugly = prime * ugly_numbers[index]
            while next_ugly in seen:
                index += 1
                next_ugly = prime * ugly_numbers[index]
            heapq.heappush(heap, (next_ugly, prime, index + 1))
            ugly_numbers.append(val)
            seen.add(val)

        return ugly_numbers[-1]