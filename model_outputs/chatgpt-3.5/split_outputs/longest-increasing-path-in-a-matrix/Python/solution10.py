from collections import deque

class Solution(object):
    def longestIncreasingPath(self, matrix):
        if not matrix:
            return 0
        m, n = len(matrix), len(matrix[0])
        directions = [(0, 1), (0, -1), (1, 0), (-1, 0)]
        dp = [[1] * n for _ in range(m)]
        queue = deque()

        for i in range(m):
            for j in range(n):
                queue.append((i, j))
        
        while queue:
            x, y = queue.popleft()
            for dx, dy in directions:
                nx, ny = x + dx, y + dy
                if 0 <= nx < m and 0 <= ny < n and matrix[nx][ny] > matrix[x][y]:
                    dp[nx][ny] = max(dp[nx][ny], dp[x][y] + 1)
                    queue.append((nx, ny))
                    
        return max(max(row) for row in dp)
