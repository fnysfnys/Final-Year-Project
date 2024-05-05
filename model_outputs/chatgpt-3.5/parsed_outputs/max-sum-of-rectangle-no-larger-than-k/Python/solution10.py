class Solution(object):
    def maxSumSubmatrix(self, matrix, k):
        m, n = len(matrix), len(matrix[0])
        max_sum = float('-inf')
        for i in range(m):
            for j in range(n):
                prefix_sum = [[0] * (n + 1) for _ in range(m + 1)]
                for x in range(1, m + 1):
                    for y in range(1, n + 1):
                        prefix_sum[x][y] = matrix[x - 1][y - 1] + prefix_sum[x - 1][y] + prefix_sum[x][y - 1] - prefix_sum[x - 1][y - 1]
                for p in range(i, m):
                    for q in range(j, n):
                        submatrix_sum = prefix_sum[p + 1][q + 1] - prefix_sum[i][q + 1] - prefix_sum[p + 1][j] + prefix_sum[i][j]
                        if submatrix_sum == k:
                            return k
                        if submatrix_sum < k:
                            max_sum = max(max_sum, submatrix_sum)
                        else:
                            submatrix_sums = [0]
                            for x in range(1, m + 1):
                                for y in range(1, n + 1):
                                    submatrix_val = prefix_sum[x][y] - prefix_sum[x - 1][y] - prefix_sum[x][y - 1] + prefix_sum[x - 1][y - 1]
                                    index = bisect.bisect_left(submatrix_sums, submatrix_val - k)
                                    if index < len(submatrix_sums):
                                        max_sum = max(max_sum, submatrix_val - submatrix_sums[index])
                                    bisect.insort(submatrix_sums, submatrix_val)
        return max_sum