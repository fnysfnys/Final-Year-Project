class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
       if maxChoosableInteger >= desiredTotal:
           return False
       memo = {}
       for i in range(1, maxChoosableInteger + 1):
           if self.canIWin(maxChoosableInteger - i, desiredTotal - i):
               return True
       return False
    
