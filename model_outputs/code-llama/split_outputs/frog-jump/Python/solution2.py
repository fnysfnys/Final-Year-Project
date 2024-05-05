def canCross(stones):
   if len(stones) == 1:
       return True
   if stones[1] - stones[0] > 1:
       return False
   return canCross(stones[1:])
