class Solution(object):
    def longestIncreasingPath(self, matrix):
        def dfs(i, j):
            if (i, j) in visited:
                return memo[(i, j)]
            val = matrix[i][j]
            max_length = 0
            for x, y in [(i-1, j), (i+1, j), (i, j-1), (i, j+1)]:
                if 0 <= x < len(matrix) and 0 <= y < len(matrix[0]) and matrix[x][y] > val:
                    max_length = max(max_length, dfs(x, y))
            memo[(i, j)] = max_length + 1
            visited.add((i, j))
            return max_length + 1
        
        if not matrix:
            return 0
        memo = {}
        visited = set()
        max_length = 0
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                max_length = max(max_length, dfs(i, j))
        return max_length
