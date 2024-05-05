class Solution(object):
    def getRow(self, rowIndex):
       memo = {}
       def helper(rowIndex):
           if rowIndex == 0:
               return 1
           elif rowIndex == 1:
               return 1
           else:
               if rowIndex not in memo:
                   memo[rowIndex] = helper(rowIndex - 1) + helper(rowIndex - 2)
               return memo[rowIndex]
       return helper(rowIndex)
    
