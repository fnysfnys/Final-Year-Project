import heapq

class Solution(object):
    def nthUglyNumber(self, n):
        heap = [1]
        seen = set()
        for _ in range(n - 1):
            num = heapq.heappop(heap)
            for prime in [2, 3, 5]:
                new_num = num * prime
                if new_num not in seen:
                    heapq.heappush(heap, new_num)
                    seen.add(new_num)
        return heap[0]
    
