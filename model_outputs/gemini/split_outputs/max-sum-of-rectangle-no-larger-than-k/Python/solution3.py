def maxSumSubmatrix_prefixsum(self, matrix, k):
    m, n = len(matrix), len(matrix[0])
    prefix_sum = [[0] * (n+1) for _ in range(m+1)]
    for i in range(1, m+1):
        for j in range(1, n+1):
            prefix_sum[i][j] = prefix_sum[i-1][j] + prefix_sum[i][j-1] - prefix_sum[i-1][j-1] + matrix[i-1][j-1]
    
    max_sum = float('-inf')
    for size in range(1, min(m, n) + 1):
        for i in range(m - size + 1):
            for j in range(n - size + 1):
                submatrix_sum = prefix_sum[i+size][j+size] - prefix_sum[i+size][j] - prefix_sum[i][j+size] + prefix_sum[i][j]
                if submatrix_sum <= k and submatrix_sum > max_sum:
                    max_sum = submatrix_sum
    return max_sum
