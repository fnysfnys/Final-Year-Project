from collections import deque

class Solution(object):
    def nthUglyNumber(self, n):
        """
        An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
        Given an integer n, return the nth ugly number.
        """
        ugly_numbers = [1]
        i, j, k = 0, 0, 0
        queue2, queue3, queue5 = deque([2]), deque([3]), deque([5])

        while len(ugly_numbers) < n:
            next_ugly = min(queue2[0], queue3[0], queue5[0])
            ugly_numbers.append(next_ugly)

            if next_ugly == queue2[0]:
                queue2.popleft()
            if next_ugly == queue3[0]:
                queue3.popleft()
            if next_ugly == queue5[0]:
                queue5.popleft()

            queue2.append(next_ugly * 2)
            queue3.append(next_ugly * 3)
            queue5.append(next_ugly * 5)

        return ugly_numbers[-1]
