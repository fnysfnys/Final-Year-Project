class Solution(object):
    def maxSumSubmatrix(self, matrix, k):
        """
        ... [docstring as in the original question] ...
        """
        def maxCrossingSum(arr, left, mid, right):
            # Include elements on left of mid.
            sm = 0; left_sum = float('-inf')
            for i in range(mid, left-1, -1):
                sm = sm + arr[i]
                if sm > left_sum:
                    left_sum = sm
            # Include elements on right of mid
            sm = 0; right_sum = float('-inf')
            for i in range(mid + 1, right + 1):
                sm = sm + arr[i]
                if sm > right_sum:
                    right_sum = sm
            # Return sum of elements on left and right of mid
            return left_sum + right_sum

        def maxSumSubRect(left, right, up, down):
            if left == right and up == down:
                return matrix[up][left]

            mid_row = (up + down) // 2
            mid_col = (left + right) // 2

            topLeftSum = maxSumSubRect(left, mid_col, up, mid_row)
            topRightSum = maxSumSubRect(mid_col + 1, right, up, mid_row)
            bottomLeftSum = maxSumSubRect(left, mid_col, mid_row + 1, down)
            bottomRightSum = maxSumSubRect(mid_col + 1, right, mid_row + 1, down)

            max_sum = max(topLeftSum, topRightSum, bottomLeftSum, bottomRightSum)

            max_sum = max(max_sum, maxCrossingSum(matrix, left, mid_col, right, up, mid_row, down))

            return max_sum

        rows, cols = len(matrix), len(matrix[0])
        return maxSumSubRect(0, cols - 1, 0, rows - 1)