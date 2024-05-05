def maxSumSubmatrix(matrix, k):
   rows = len(matrix)
   cols = len(matrix[0])
   max_sum = -float('inf')
   for i in range(rows):
       for j in range(cols):
           for m in range(i, rows):
               for n in range(j, cols):
                   sum = 0
                   for r in range(i, m+1):
                       for c in range(j, n+1):
                           sum += matrix[r][c]
                   if sum <= k:
                       max_sum = max(max_sum, sum)
   return max_sum
