class Solution:
    def longestIncreasingPath(self, matrix):
        if not matrix:
            return 0

        m, n = len(matrix), len(matrix[0])
        memo = {}
        directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]

        def dfs(x, y):
            if (x, y) in memo:
                return memo[(x, y)]
            maxValue = 1
            for dx, dy in directions:
                nx, ny = x + dx, y + dy
                if 0 <= nx < m and 0 <= ny < n and matrix[nx][ny] > matrix[x][y]:
                    maxValue = max(maxValue, 1 + dfs(nx, ny))
            memo[(x, y)] = maxValue
            return maxValue

        return max(dfs(x, y) for x in range(m) for y in range(n))
