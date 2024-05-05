class Solution(object):
    def longestIncreasingPath(self, matrix):
        def dfs(i, j):
            nonlocal max_length
            if dp[i][j]:
                return dp[i][j]
            val = matrix[i][j]
            for x, y in [(i-1, j), (i+1, j), (i, j-1), (i, j+1)]:
                if 0 <= x < len(matrix) and 0 <= y < len(matrix[0]) and matrix[x][y] > val:
                    dp[i][j] = max(dp[i][j], dfs(x, y))
            dp[i][j] += 1
            max_length = max(max_length, dp[i][j])
            return dp[i][j]
        
        if not matrix:
            return 0
        dp = [[0] * len(matrix[0]) for _ in range(len(matrix))]
        max_length = 0
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                dfs(i, j)
        return max_length
