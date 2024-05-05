class Solution:
       def generate(self, numRows):
           if numRows == 1:
               return [[1]]
           else:
               result = self.generate(numRows - 1)
               lastRow = result[-1]
               newRow = [1] + [lastRow[i] + lastRow[i + 1] for i in range(len(lastRow) - 1)] + [1]
               result.append(newRow)
               return result