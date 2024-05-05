class Solution(object):
    def getRow(self, rowIndex):
      row = 1
      for i in range(rowIndex):
        row = (row << 1) ^ row
      return [int(x) for x in bin(row)[2:]]
    
