class Solution(object):
    def longestIncreasingPath(self, matrix):
        if not matrix:
            return 0
        m, n = len(matrix), len(matrix[0])
        directions = [(0, 1), (0, -1), (1, 0), (-1, 0)]
        visited = [[False] * n for _ in range(m)]
        queue = []
        max_length = 1

        for i in range(m):
            for j in range(n):
                queue.append(((i, j), 1))
                while queue:
                    (x, y), length = queue.pop(0)
                    max_length = max(max_length, length)
                    for dx, dy in directions:
                        nx, ny = x + dx, y + dy
                        if 0 <= nx < m and 0 <= ny < n and not visited[nx][ny] and matrix[nx][ny] > matrix[x][y]:
                            visited[nx][ny] = True
                            queue.append(((nx, ny), length + 1))
        return max_length
