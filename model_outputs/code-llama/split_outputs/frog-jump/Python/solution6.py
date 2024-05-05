def canCross(stones):
   if len(stones) == 1:
       return True
   if stones[1] - stones[0] > 1:
       return False
   mid = len(stones) // 2
   left = canCross(stones[:mid])
   right = canCross(stones[mid:])
   return left and right
