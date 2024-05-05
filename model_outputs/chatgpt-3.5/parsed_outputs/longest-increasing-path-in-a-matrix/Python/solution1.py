class Solution(object):
    def longestIncreasingPath(self, matrix):
        def dfs(i, j):
            if not dp[i][j]:
                val = matrix[i][j]
                dp[i][j] = 1 + max(
                    dfs(x, y) if 0 <= x < m and 0 <= y < n and matrix[x][y] > val else 0
                    for x, y in ((i - 1, j), (i + 1, j), (i, j - 1), (i, j + 1))
                )
            return dp[i][j]

        if not matrix:
            return 0
        m, n = len(matrix), len(matrix[0])
        dp = [[0] * n for _ in range(m)]
        return max(dfs(i, j) for i in range(m) for j in range(n))