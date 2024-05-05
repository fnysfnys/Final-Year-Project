import heapq

class Solution(object):
    def maxSumSubmatrix(self, matrix, k):
        m, n = len(matrix), len(matrix[0])
        max_sum = float('-inf')
        for i in range(m):
            for j in range(n):
                submatrix_sums = []
                for p in range(i, m):
                    for q in range(j, n):
                        submatrix_sum = matrix[p][q]
                        if p > i:
                            submatrix_sum += submatrix_sums[p - i - 1][q - j]
                        if q > j:
                            submatrix_sum += submatrix_sums[p - i][q - j - 1]
                        if p > i and q > j:
                            submatrix_sum -= submatrix_sums[p - i - 1][q - j - 1]
                        if submatrix_sum <= k:
                            max_sum = max(max_sum, submatrix_sum)
                        heapq.heappush(submatrix_sums, submatrix_sum)
        return max_sum