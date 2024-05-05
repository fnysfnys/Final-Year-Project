class Solution(object):
    def nthUglyNumber(self, n):
        """
        An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
        Given an integer n, return the nth ugly number.
        """
        ugly_numbers = {1}
        heap = [1]

        while n > 0:
            current = heapq.heappop(heap)
            n -= 1

            for factor in [2, 3, 5]:
                next_ugly = current * factor
                if next_ugly not in ugly_numbers:
                    ugly_numbers.add(next_ugly)
                    heapq.heappush(heap, next_ugly)

        return current
