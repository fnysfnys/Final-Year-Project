class Solution(object):
    def maxSumSubmatrix(self, matrix, k):
        m, n = len(matrix), len(matrix[0])
        max_sum = float('-inf')
        for i1 in range(m):
            for j1 in range(n):
                for i2 in range(i1, m):
                    for j2 in range(j1, n):
                        submatrix_sum = sum(matrix[i][j] for i in range(i1, i2 + 1) for j in range(j1, j2 + 1))
                        if submatrix_sum <= k:
                            max_sum = max(max_sum, submatrix_sum)
        return max_sum
