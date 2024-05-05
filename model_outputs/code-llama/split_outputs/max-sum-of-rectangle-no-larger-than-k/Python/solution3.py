def maxSumSubmatrix(matrix, k):
   rows = len(matrix)
   cols = len(matrix[0])
   max_sum = -float('inf')
   for i in range(rows):
       for j in range(cols):
           sum = 0
           for r in range(i, rows):
               for c in range(j, cols):
                   sum += matrix[r][c]
           if sum <= k:
               max_sum = max(max_sum, sum)
   return max_sum
