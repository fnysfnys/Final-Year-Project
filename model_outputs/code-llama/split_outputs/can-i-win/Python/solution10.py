def canIWin(maxChoosableInteger, desiredTotal):
   if maxChoosableInteger >= desiredTotal:
       return False
   stack = []
   for i in range(1, maxChoosableInteger + 1):
       if canIWin(maxChoosableInteger - i, desiredTotal - i):
           return True
   return False
