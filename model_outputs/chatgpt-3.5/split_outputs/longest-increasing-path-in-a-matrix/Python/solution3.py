from collections import deque

class Solution(object):
    def longestIncreasingPath(self, matrix):
        if not matrix:
            return 0
        m, n = len(matrix), len(matrix[0])
        indegree = [[0] * n for _ in range(m)]
        directions = [(0, 1), (0, -1), (1, 0), (-1, 0)]

        for i in range(m):
            for j in range(n):
                for dx, dy in directions:
                    x, y = i + dx, j + dy
                    if 0 <= x < m and 0 <= y < n and matrix[x][y] < matrix[i][j]:
                        indegree[i][j] += 1

        queue = deque([(i, j) for i in range(m) for j in range(n) if indegree[i][j] == 0])
        length = 0

        while queue:
            length += 1
            for _ in range(len(queue)):
                x, y = queue.popleft()
                for dx, dy in directions:
                    nx, ny = x + dx, y + dy
                    if 0 <= nx < m and 0 <= ny < n and matrix[nx][ny] > matrix[x][y]:
                        indegree[nx][ny] -= 1
                        if indegree[nx][ny] == 0:
                            queue.append((nx, ny))

        return length
