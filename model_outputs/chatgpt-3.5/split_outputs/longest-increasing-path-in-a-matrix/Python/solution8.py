class Solution(object):
    def longestIncreasingPath(self, matrix):
        if not matrix:
            return 0
        m, n = len(matrix), len(matrix[0])
        dp = [[1] * n for _ in range(m)]
        directions = [(0, 1), (0, -1), (1, 0), (-1, 0)]
        
        for i in range(m):
            for j in range(n):
                for dx, dy in directions:
                    x, y = i + dx, j + dy
                    if 0 <= x < m and 0 <= y < n and matrix[x][y] > matrix[i][j]:
                        dp[i][j] = max(dp[i][j], dp[x][y] + 1)
                        
        return max(max(row) for row in dp)
