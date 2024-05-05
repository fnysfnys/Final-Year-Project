from collections import deque

class Solution(object):
    def integerReplacement(self, n):
        """
        Given a positive integer n, you can apply one of the following operations:

        If n is even, replace n with n / 2.
        If n is odd, replace n with either n + 1 or n - 1.

        Return the minimum number of operations needed for n to become 1.

        :type n: int
        :rtype: int
        """
        queue = deque([(n, 0)])
        
        while queue:
            num, steps = queue.popleft()
            if num == 1:
                return steps
            if num % 2 == 0:
                queue.append((num // 2, steps + 1))
            else:
                queue.append((num + 1, steps + 1))
                queue.append((num - 1, steps + 1))