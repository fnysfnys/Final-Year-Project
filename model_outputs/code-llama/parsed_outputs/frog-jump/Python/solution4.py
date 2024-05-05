class Solution(object):
    def canCross(self, stones):
       if len(stones) == 1:
           return True
       if stones[1] - stones[0] > 1:
           return False
       for i in range(2, len(stones)):
           if stones[i] - stones[i-1] > 1:
               return False
       return True
    
