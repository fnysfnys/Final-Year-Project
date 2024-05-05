class Solution(object):
    def nthUglyNumber(self, n):
        def generate_ugly_numbers():
            heap = [1]
            seen = set()
            while True:
                num = heapq.heappop(heap)
                yield num
                for factor in [2, 3, 5]:
                    next_ugly = num * factor
                    if next_ugly not in seen:
                        seen.add(next_ugly)
                        heapq.heappush(heap, next_ugly)

        gen = generate_ugly_numbers()
        for _ in range(n):
            result = next(gen)
        return result
