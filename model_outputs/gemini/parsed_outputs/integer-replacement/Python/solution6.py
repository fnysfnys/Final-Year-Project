from collections import deque

class Solution(object):
    def integerReplacement(self, n):
        queue = deque([(n, 0)])
        visited = set()
        while queue:
            num, count = queue.popleft()
            if num == 1:
                return count
            if num not in visited:
                visited.add(num)
                if num % 2 == 0:
                    queue.append((num // 2, count + 1))
                else:
                    queue.append((num + 1, count + 1))
                    queue.append((num - 1, count + 1))
        return -1
