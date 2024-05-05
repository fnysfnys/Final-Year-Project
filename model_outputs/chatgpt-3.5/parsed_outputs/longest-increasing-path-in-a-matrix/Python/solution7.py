class Solution(object):
    def longestIncreasingPath(self, matrix):
        if not matrix:
            return 0
        m, n = len(matrix), len(matrix[0])
        dp = [[0] * n for _ in range(m)]
        
        def dfs(i, j):
            if dp[i][j]:
                return dp[i][j]
            val = matrix[i][j]
            length = 0
            for x, y in [(i-1, j), (i+1, j), (i, j-1), (i, j+1)]:
                if 0 <= x < m and 0 <= y < n and matrix[x][y] > val:
                    length = max(length, dfs(x, y))
            dp[i][j] = length + 1
            return length + 1
        
        max_length = 0
        for i in range(m):
            for j in range(n):
                max_length = max(max_length, dfs(i, j))
        return max_length