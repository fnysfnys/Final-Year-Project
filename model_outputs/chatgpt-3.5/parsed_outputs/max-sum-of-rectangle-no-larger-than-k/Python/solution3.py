import bisect

class Solution(object):
    def maxSumSubmatrix(self, matrix, k):
        m, n = len(matrix), len(matrix[0])
        max_sum = float('-inf')
        for i in range(n):
            prefix_sum = [0] * m
            for j in range(i, n):
                for p in range(m):
                    prefix_sum[p] += matrix[p][j]
                submatrix_sums = [0]
                current_sum = 0
                for val in prefix_sum:
                    current_sum += val
                    index = bisect.bisect_left(submatrix_sums, current_sum - k)
                    if index < len(submatrix_sums):
                        max_sum = max(max_sum, current_sum - submatrix_sums[index])
                    bisect.insort(submatrix_sums, current_sum)
        return max_sum