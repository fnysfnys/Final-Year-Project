class Solution(object):
    def getRow(self, rowIndex):
      result = [1]
      if rowIndex == 0: return result
      for i in range(1, rowIndex+1):
        prevRow = result
        result = [1] + [prevRow[i-1] + prevRow[i] for i in range(len(prevRow))] + [1]
      return result
    
