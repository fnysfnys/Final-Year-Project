import heapq

class Solution(object):
    def nthUglyNumber(self, n):
        heap = [1]
        seen = set()

        while n > 0:
            num = heapq.heappop(heap)
            n -= 1

            if n == 0:
                return num

            for factor in [2, 3, 5]:
                next_ugly = num * factor
                if next_ugly not in seen:
                    seen.add(next_ugly)
                    heapq.heappush(heap, next_ugly)
