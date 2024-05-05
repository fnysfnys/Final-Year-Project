class Solution(object):
    def maxSumSubmatrix(self, matrix, k):
       rows = len(matrix)
       cols = len(matrix[0])
       dp = [[0] * (cols+1) for _ in range(rows+1)]
       for i in range(rows):
           for j in range(cols):
               dp[i+1][j+1] = max(dp[i][j], dp[i][j+1], dp[i+1][j]) + matrix[i][j]
       max_sum = -float('inf')
       for i in range(rows):
           for j in range(cols):
               sum = 0
               for r in range(i, rows):
                   for c in range(j, cols):
                       sum += dp[r+1][c+1] - dp[i][c+1] - dp[r+1][j] + dp[i][j]
               if sum <= k:
                   max_sum = max(max_sum, sum)
       return max_sum
    
