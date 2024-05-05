import heapq

class Solution(object):
    def nthUglyNumber(self, n):
        """
        (docstring as provided)
        """
        heap = [1]
        seen

 = {1}
        factors = [2, 3, 5]

        for _ in range(n):
            current = heapq.heappop(heap)
            for factor in factors:
                new_ugly = current * factor
                if new_ugly not in seen:
                    seen.add(new_ugly)
                    heapq.heappush(heap, new_ugly)

        return current
