class Solution(object):
    def maxSumSubmatrix(self, matrix, k):
        m, n = len(matrix), len(matrix[0])
        max_sum = float('-inf')
        for left in range(n):
            row_sum = [0] * m
            for right in range(left, n):
                for i in range(m):
                    row_sum[i] += matrix[i][right]
                prefix_sum = [0]
                curr_sum = 0
                for s in row_sum:
                    curr_sum += s
                    idx = bisect.bisect_left(prefix_sum, curr_sum - k)
                    if idx < len(prefix_sum):
                        max_sum = max(max_sum, curr_sum - prefix_sum[idx])
                    bisect.insort(prefix_sum, curr_sum)
        return max_sum
