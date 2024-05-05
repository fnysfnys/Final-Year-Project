class Solution:
       def generate(self, numRows):
           import numpy as np
           triangle = np.zeros((numRows, numRows), dtype=int)
           triangle[:, 0] = 1
           for i in range(1, numRows):
               for j in range(1, i + 1):
                   triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j]
           return [row[:i + 1].tolist() for i, row in enumerate(triangle)]