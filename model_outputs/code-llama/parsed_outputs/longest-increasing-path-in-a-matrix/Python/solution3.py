class Solution(object):
    def longestIncreasingPath(self, matrix):
       stack = []
       for i in range(len(matrix)):
           for j in range(len(matrix[0])):
               if matrix[i][j] == 0:
                   continue
               stack.append((i, j))
               while stack:
                   row, col = stack.pop()
                   left = row - 1 if col > 0 else 0
                   right = row + 1 if col < len(matrix[0]) - 1 else 0
                   up = row - 1 if row > 0 else 0
                   down = row + 1 if row < len(matrix) - 1 else 0
                   if matrix[row][col] > matrix[left][col] and matrix[row][col] > matrix[right][col] and matrix[row][col] > matrix[up][col] and matrix[row][col] > matrix[down][col]:
                       return matrix[row][col]
       return 0
    
