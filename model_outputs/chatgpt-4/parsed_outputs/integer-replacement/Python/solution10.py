from collections import deque

class Solution(object):
    def integerReplacement(self, n):
        # Docstring here

        queue = deque([(n, 0)])
        while queue:
            current, steps = queue.popleft()
            if current == 1:
                return steps
            if current % 2 == 0:
                queue.append((current // 2, steps + 1))
            else:
                queue.append((current - 1, steps + 1))
                queue.append((current + 1, steps + 1))