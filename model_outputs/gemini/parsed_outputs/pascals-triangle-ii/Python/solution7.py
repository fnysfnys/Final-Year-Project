class Solution(object):
    def getRow(self, rowIndex):
      return [1] + [2**i // (i+1) for i in range(1, rowIndex+1)]
    
