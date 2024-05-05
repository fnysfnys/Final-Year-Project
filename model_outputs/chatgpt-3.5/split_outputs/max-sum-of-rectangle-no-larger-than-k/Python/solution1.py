class Solution(object):
    def maxSumSubmatrix(self, matrix, k):
        m, n = len(matrix), len(matrix[0])
        max_sum = float('-inf')
        for i in range(m):
            for j in range(n):
                for p in range(i, m):
                    for q in range(j, n):
                        submatrix_sum = sum(matrix[x][y] for x in range(i, p + 1) for y in range(j, q + 1))
                        if submatrix_sum <= k:
                            max_sum = max(max_sum, submatrix_sum)
        return max_sum
