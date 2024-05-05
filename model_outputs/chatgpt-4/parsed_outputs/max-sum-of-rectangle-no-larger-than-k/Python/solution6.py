import bisect

class Solution(object):
    def maxSumSubmatrix(self, matrix, k):
        """
        ... [docstring as in the original question] ...
        """
        rows, cols = len(matrix), len(matrix[0])
        max_sum = float('-inf')

        for left in range(cols):
            row_sums = [0] * rows
            for right in range(left, cols):
                for i in range(rows):
                    row_sums[i] += matrix[i][right]
                set_sums = [0]
                curr_sum = 0
                for sum_val in row_sums:
                    curr_sum += sum_val
                    i = bisect.bisect_left(set_sums, curr_sum - k)
                    if i != len(set_sums):
                        max_sum = max(max_sum, curr_sum - set_sums[i])
                    bisect.insort(set_sums, curr_sum)
        return max_sum