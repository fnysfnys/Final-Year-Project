class Solution(object):
    def getRow(self, rowIndex):
       result = []
       for i in range(rowIndex + 1):
           if i == 0:
               result.append(1)
           else:
               result.append(result[i - 1] + result[i - 2])
       return result
    
