class Solution:
       def generate(self, numRows):
           result = [[1]]
           for i in range(1, numRows):
               newRow = [1]
               for j in range(1, i):
                   newRow.insert(j, result[i - 1][j - 1] + result[i - 1][j])
               newRow.append(1)
               result.append(newRow)
           return result