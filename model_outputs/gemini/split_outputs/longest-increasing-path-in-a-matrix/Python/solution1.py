def longestIncreasingPath(self, matrix):
    m, n = len(matrix), len(matrix[0])
    dp = [[None] * n for _ in range(m)]

    def dfs(i, j):
        if dp[i][j] is not None:
            return dp[i][j]
        directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]
        max_len = 0
        for dx, dy in directions:
            ni, nj = i + dx, j + dy
            if 0 <= ni < m and 0 <= nj < n and matrix[ni][nj] > matrix[i][j]:
                max_len = max(max_len, dfs(ni, nj))
        dp[i][j] = max_len + 1
        return dp[i][j]

    max_path = 0
    for i in range(m):
        for j in range(n):
            max_path = max(max_path, dfs(i, j))
    return max_path
