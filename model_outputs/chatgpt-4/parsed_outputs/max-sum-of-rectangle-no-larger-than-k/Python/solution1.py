class Solution(object):
    def maxSumSubmatrix(self, matrix, k):
        """
        ... [docstring as in the original question] ...
        """
        def getSum(x1, y1, x2, y2):
            sum_val = 0
            for i in range(x1, x2):
                for j in range(y1, y2):
                    sum_val += matrix[i][j]
            return sum_val

        rows, cols = len(matrix), len(matrix[0])
        max_sum = float('-inf')
        for x1 in range(rows):
            for y1 in range(cols):
                for x2 in range(x1 + 1, rows + 1):
                    for y2 in range(y1 + 1, cols + 1):
                        curr_sum = getSum(x1, y1, x2, y2)
                        if curr_sum <= k:
                            max_sum = max(max_sum, curr_sum)
        return max_sum