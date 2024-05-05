class Solution(object):
    def canCross(self, stones):
       for i in range(1, len(stones)):
           if stones[i] - stones[i-1] > 1:
               return False
       return True
    
