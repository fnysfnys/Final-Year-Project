def maxSumSubmatrix_bruteforce(self, matrix, k):
    max_sum = float('-inf')
    for i in range(len(matrix)):
        for j in range(len(matrix[0])):
            for m in range(i, len(matrix)):
                for n in range(j, len(matrix[0])):
                    submatrix_sum = 0
                    for p in range(i, m+1):
                        for q in range(j, n+1):
                            submatrix_sum += matrix[p][q]
                    if submatrix_sum <= k and submatrix_sum > max_sum:
                        max_sum = submatrix_sum
    return max_sum
