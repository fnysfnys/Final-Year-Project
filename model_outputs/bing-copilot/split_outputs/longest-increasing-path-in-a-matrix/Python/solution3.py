    class Solution(object):
        def longestIncreasingPath(self, matrix):
            ylen, xlen = len(matrix), len(matrix[0])
            indegree = [[0] * xlen for _ in range(ylen)]
            directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]

            for i in range(ylen):
                for j in range(xlen):
                    for dx, dy in directions:
                        nx, ny = i + dx, j + dy
                        if 0 <= nx < ylen and 0 <= ny < xlen and matrix[nx][ny] < matrix[i][j]:
                            indegree[i][j] += 1

            queue = [(i, j) for i in range(ylen) for j in range(xlen) if indegree[i][j] == 0]
            ans = 0

            while queue:
                ans += 1
                next_queue = []
                for i, j in queue:
                    for dx, dy in directions:
                        nx, ny = i + dx, j + dy
                        if 0 <= nx < ylen and 0 <= ny < xlen and matrix[nx][ny] > matrix[i][j]:
                            indegree[nx][ny] -= 1
                            if indegree[nx][ny] == 0:
                                next_queue.append((nx, ny))
                queue = next_queue

            return ans
    