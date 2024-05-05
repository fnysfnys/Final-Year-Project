class Solution(object):
    def longestIncreasingPath(self, matrix):
        if not matrix or not matrix[0]:
            return 0
        
        def dfs(i, j, prev):
            if i < 0 or i >= len(matrix) or j < 0 or j >= len(matrix[0]) or matrix[i][j] <= prev:
                return 0
            if (i, j) in memo:
                return memo[(i, j)]
            
            res = 1 + max(dfs(i+1, j, matrix[i][j]), dfs(i-1, j, matrix[i][j]),
                          dfs(i, j+1, matrix[i][j]), dfs(i, j-1, matrix[i][j]))
            memo[(i, j)] = res
            return res
        
        memo = {}
        return max(dfs(i, j, float('-inf')) for i in range(len(matrix)) for j in range(len(matrix[0])))
