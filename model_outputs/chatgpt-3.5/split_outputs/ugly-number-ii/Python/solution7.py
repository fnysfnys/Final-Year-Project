import heapq

class Solution(object):
    def nthUglyNumber(self, n):
        """
        An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
        Given an integer n, return the nth ugly number.
        """
        ugly_numbers = [1]
        heap = [(2, 2), (3, 3), (5, 5)]

        while len(ugly_numbers) < n:
            next_ugly, factor = heapq.heappop(heap)
            ugly_numbers.append(next_ugly)

            if factor == 2:
                heapq.heappush(heap, (next_ugly * 2, 2))
            elif factor == 3:
                heapq.heappush(heap, (next_ugly * 3, 3))
            else:
                heapq.heappush(heap, (next_ugly * 5, 5))

        return ugly_numbers[-1]
