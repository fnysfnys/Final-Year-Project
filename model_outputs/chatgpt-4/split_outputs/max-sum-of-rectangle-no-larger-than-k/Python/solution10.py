class Solution(object):
    def maxSumSubmatrix(self, matrix, k):
        """
        ... [docstring as in the original question] ...
        """
        rows, cols = len(matrix), len(matrix[0])
        memo = {}
        def helper(left, right, top, bottom):
            if (left, right, top, bottom) in memo:
                return memo[(left, right, top, bottom)]

            if left > right or top > bottom:
                return float('-inf')

            sum_val = sum(matrix[i][j] for i in range(top, bottom + 1) for j in range(left, right + 1))
            if sum_val <= k:
                max_sum = sum_val
            else:
                max_sum = max(helper(left + 1, right, top, bottom), 
                              helper(left, right - 1, top, bottom), 
                              helper(left, right, top + 1, bottom), 
                              helper(left, right, top, bottom - 1))

            memo[(left, right, top, bottom)] = max_sum
            return max_sum

        return helper(0, cols - 1, 0, rows - 1)
