def longestIncreasingPath(matrix):
   memo = {}
   dp = [[0] * len(matrix[0]) for _ in range(len(matrix))]
   for i in range(len(matrix)):
       for j in range(len(matrix[0])):
           if matrix[i][j] == 0:
               continue
           left = dp[i][j - 1] if j > 0 else 0
           right = dp[i][j + 1] if j < len(matrix[0]) - 1 else 0
           up = dp[i - 1][j] if i > 0 else 0
           down = dp[i + 1][j] if i < len(matrix) - 1 else 0
           dp[i][j] = max(left, right, up, down) + 1
           memo[(i, j)] = dp[i][j]
   return memo[(0, 0)]
