class Solution(object):
    def longestIncreasingPath(self, matrix):
        m, n = len(matrix), len(matrix[0])
        stack = [(i, j, 1) for i in range(m) for j in range(n)]
        max_path = 0
        while stack:
            i, j, path_len = stack.pop()
            if 0 <= i < m and 0 <= j < n and path_len > max_path:
                directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]
                for dx, dy in directions:
                    ni, nj = i + dx, j + dy
                    if 0 <= ni < m and 0 <= nj < n and matrix[ni][nj] > matrix[i][j]:
                        stack.append((ni, nj, path_len + 1))
                max_path = max(max_path, path_len)
        return max_path
    
