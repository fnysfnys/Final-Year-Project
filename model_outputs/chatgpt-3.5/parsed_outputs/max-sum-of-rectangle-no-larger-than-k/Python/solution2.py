class Solution(object):
    def maxSumSubmatrix(self, matrix, k):
        m, n = len(matrix), len(matrix[0])
        max_sum = float('-inf')
        for i in range(m):
            for j in range(n):
                prefix_sum = [[0] * n for _ in range(m)]
                for p in range(i, m):
                    for q in range(j, n):
                        submatrix_sum = prefix_sum[p][q] + matrix[p][q]
                        if p > i:
                            submatrix_sum -= prefix_sum[i][q]
                        if q > j:
                            submatrix_sum -= prefix_sum[p][j]
                        if p > i and q > j:
                            submatrix_sum += prefix_sum[i][j]
                        if submatrix_sum <= k:
                            max_sum = max(max_sum, submatrix_sum)
                        prefix_sum[p][q] = submatrix_sum
        return max_sum