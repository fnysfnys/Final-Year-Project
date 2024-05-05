def longestIncreasingPath(matrix):
   def helper(row, col):
       if row < 0 or col < 0 or row >= len(matrix) or col >= len(matrix[0]):
           return 0
       if matrix[row][col] == 0:
           return 0
       left = helper(row, col - 1)
       right = helper(row, col + 1)
       up = helper(row - 1, col)
       down = helper(row + 1, col)
       return max(left, right, up, down) + 1
   return helper(0, 0)
