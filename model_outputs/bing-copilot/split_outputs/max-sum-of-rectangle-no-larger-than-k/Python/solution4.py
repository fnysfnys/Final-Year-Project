class Solution(object):
    def maxSumSubmatrix(self, matrix, k):
        m, n = len(matrix), len(matrix[0])
        max_sum = float('-inf')
        for i1 in range(m):
            row_sum = [0] * n
            for i2 in range(i1, m):
                for j in range(n):
                    row_sum[j] += matrix[i2][j]
                prefix_sum = [0]
                curr_sum = 0
                for s in row_sum:
                    curr_sum += s
                    idx = bisect.bisect_left(prefix_sum, curr_sum - k)
                    if idx < len(prefix_sum):
                        max_sum = max(max_sum, curr_sum - prefix_sum[idx])
                    bisect.insort(prefix_sum, curr_sum)
        return max_sum
