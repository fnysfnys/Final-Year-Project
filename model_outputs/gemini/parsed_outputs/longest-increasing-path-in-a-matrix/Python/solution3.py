class Solution(object):
    def longestIncreasingPath(self, matrix):
        m, n = len(matrix), len(matrix[0])
        queue = [(i, j, 1) for i in range(m) for j in range(n)]
        seen = set()
        max_path = 0
        while queue:
            level_size = len(queue)
            for _ in range(level_size):
                i, j, path_len = queue.pop(0)
                if (i, j) in seen or path_len <= max_path:
                    continue
                directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]
                for dx, dy in directions:
                    ni, nj = i + dx, j + dy
                    if 0 <= ni < m and 0 <= nj < n and matrix[ni][nj] > matrix[i][j]:
                        queue.append((ni, nj, path_len + 1))
                        seen.add((ni, nj))
                max_path = path_len
        return max_path
    
