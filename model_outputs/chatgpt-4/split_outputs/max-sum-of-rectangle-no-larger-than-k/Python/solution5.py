class Solution(object):
    def maxSumSubmatrix(self, matrix, k):
        """
        ... [docstring as in the original question] ...
        """
        rows, cols = len(matrix), len(matrix[0])
        max_sum = float('-inf')

        for left in range(cols):
            sums = [0] * rows
            for right in range(left, cols):
                for i in range(rows):
                    sums[i] += matrix[i][right]
                for top in range(rows):
                    sum_val = 0
                    for bottom in range(top, rows):
                        sum_val += sums[bottom]
                        if sum_val <= k:
                            max_sum = max(max_sum, sum_val)
        return max_sum
