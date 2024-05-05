import heapq

class Solution(object):
    def nthUglyNumber(self, n):
        """
        (docstring as provided)
        """
        ugly_numbers = [1]
        seen = {1}
        factors = [2, 3, 5]

        for _ in range(n - 1):
            current = heapq.heappop(ugly_numbers)
            for factor in factors:
                new_ugly = current * factor
                if new_ugly not in seen:
                    seen.add(new_ugly)
                    heapq.heappush(ugly_numbers, new_ugly)

        return heapq.heappop(ugly_numbers)
