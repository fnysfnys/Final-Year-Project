class Solution(object):
    def longestIncreasingPath(self, matrix):
        ylen, xlen = len(matrix), len(matrix[0])
        dp = [[1] * xlen for _ in range(ylen)]

        directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]

        for i in range(ylen):
            for j in range(xlen):
                for dx, dy in directions:
                    nx, ny = i + dx, j + dy
                    if 0 <= nx < ylen and 0 <= ny < xlen and matrix[nx][ny] > matrix[i][j]:
                        dp[nx][ny] = max(dp[nx][ny], dp[i][j] + 1)

        return max(max(row) for row in dp)
