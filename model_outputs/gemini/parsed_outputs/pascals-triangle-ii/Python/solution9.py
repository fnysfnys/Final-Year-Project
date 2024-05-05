class Solution(object):
    def getRow(self, rowIndex):
      def lucas(n):
        if n == 0: return 2
        elif n == 1: return 1
        return lucas(n-1) + lucas(n-2)
      return [lucas(i) for i in range(rowIndex+1)]
    
