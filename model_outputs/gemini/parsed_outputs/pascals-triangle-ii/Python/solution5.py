from math import factorial

class Solution(object):
    def getRow(self, rowIndex):
      result = [factorial(i) // factorial(j) // factorial(i-j) for i in range(rowIndex+1) for j in range(i+1)]
      return result
    
