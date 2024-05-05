class Solution(object):
    def maxSumSubmatrix(self, matrix, k):
        m, n = len(matrix), len(matrix[0])
        max_sum = float('-inf')
        for left in range(n):
            row_sum = [0] * m
            for right in range(left, n):
                for i in range(m):
                    row_sum[i] += matrix[i][right]
                max_sum = max(max_sum, self.maxSumSubarray(row_sum, k))
        return max_sum

    def maxSumSubarray(self, arr, k):
        max_sum = float('-inf')
        prefix_sum = 0
        prefix_sums = [0]
        for num in arr:
            prefix_sum += num
            index = bisect.bisect_left(prefix_sums, prefix_sum - k)
            if index < len(prefix_sums):
                max_sum = max(max_sum, prefix_sum - prefix_sums[index])
            bisect.insort(prefix_sums, prefix_sum)
        return max_sum
