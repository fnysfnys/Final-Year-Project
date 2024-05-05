from collections import deque

class Solution(object):
    def integerReplacement(self, n):
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
