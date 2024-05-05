def maxSumSubmatrix_kadane(self, matrix, k):
    max_sum = float('-inf')
    for i in range(len(matrix)):
        row_sum = 0
        max_row_sum = float('-inf')
        for j in range(len(matrix[0])):
            row_sum = max(matrix[i][j], row_sum + matrix[i][j])
            max_row_sum = max(max_row_sum, row_sum)
        if max_row_sum <= k and max_row_sum > max_sum:
            max_sum = max_row_sum
    max_subarray_sum = float('-inf')
    for j in range(len(matrix[0])):
        temp_sum = 0
        for i in range(len(matrix)):
            temp_sum = max(matrix[i][j], temp_sum + matrix[i][j])
            max_subarray_sum = max(max_subarray_sum, temp_sum)
        if max_subarray_sum <= k and max_subarray_sum > max_sum:
            max_sum = max_subarray_sum
    return max_sum
