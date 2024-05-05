from collections import deque

class Solution:
    def numDistinct(self, s, t):
        queue = deque([(0, 0)])  # (index_s, index_t)
        count = 0
        while queue:
            i, j = queue.popleft()
            if j == len(t):
                count += 1
                continue
            for next_i in range(i, len(s)):
                if s[next_i] == t[j]:
                    queue.append((next_i + 1, j + 1))
        return count
