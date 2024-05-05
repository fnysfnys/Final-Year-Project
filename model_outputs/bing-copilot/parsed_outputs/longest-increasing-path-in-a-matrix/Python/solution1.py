class Solution(object):
    def longestIncreasingPath(self, matrix):
        ylen, xlen = len(matrix), len(matrix[0])
        memo = [[0] * xlen for _ in range(ylen)]

        def dfs(y, x):
            if memo[y][x]:
                return memo[y][x]
            val = matrix[y][x]
            memo[y][x] = 1 + max(
                dfs(y + 1, x) if y < ylen - 1 and matrix[y + 1][x] < val else 0,
                dfs(y - 1, x) if y > 0 and matrix[y - 1][x] < val else 0,
                dfs(y, x + 1) if x < xlen - 1 and matrix[y][x + 1] < val else 0,
                dfs(y, x - 1) if x > 0 and matrix[y][x - 1] < val else 0
            )
            return memo[y][x]

        ans = 0
        for i in range(ylen):
            for j in range(xlen):
                ans = max(ans, dfs(i, j))
        return ans
