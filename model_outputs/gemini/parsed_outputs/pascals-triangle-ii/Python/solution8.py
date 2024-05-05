class Solution(object):
    def getRow(self, rowIndex):
      result = [1]
      for i in range(1, rowIndex+1):
        result.append(result[-1] * (rowIndex - i + 1) // i)
      return result
    
