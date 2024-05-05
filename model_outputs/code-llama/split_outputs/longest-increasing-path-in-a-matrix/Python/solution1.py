def longestIncreasingPath(matrix):
   def longestPath(row, col):
       if row < 0 or col < 0 or row >= len(matrix) or col >= len(matrix[0]):
           return 0
       if matrix[row][col] == 0:
           return 0
       left = longestPath(row, col - 1)
       right = longestPath(row, col + 1)
       up = longestPath(row - 1, col)
       down = longestPath(row + 1, col)
       return max(left, right, up, down) + 1
   return longestPath(0, 0)
