class Solution(object):
    def maxSumSubmatrix(self, matrix, k):
        m, n = len(matrix), len(matrix[0])
        max_sum = float('-inf')
        for i in range(n):
            prefix_sum = [0] * m
            for j in range(i, n):
                for p in range(m):
                    prefix_sum[p] += matrix[p][j]
                current_sum = max_sum = prefix_sum[0]
                for p in range(1, m):
                    current_sum = max(prefix_sum[p], current_sum + prefix_sum[p])
                    max_sum = max(max_sum, current_sum)
                    if max_sum == k:
                        return k
                    if max_sum < k:
                        continue
                    max_sum = float('-inf')
                    for p in range(m):
                        current_sum = 0
                        for q in range(p, m):
                            current_sum += prefix_sum[q]
                            if current_sum <= k:
                                max_sum = max(max_sum, current_sum)
                    if max_sum == k:
                        return k
        return max_sum