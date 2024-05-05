class Solution(object):
    def getRow(self, rowIndex):
      if rowIndex == 0: return [1]
      prevRow = self.getRow(rowIndex - 1)
      return [1] + [prevRow[i] + prevRow[i+1] for i in range(len(prevRow)-1)] + [1]
    
