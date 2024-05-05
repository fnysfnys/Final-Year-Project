class Solution(object):
    def canCross(self, stones):
        def backtrack(position, jump):
            if position == stones[-1]:
                return True
            for nextJump in range(jump+1, jump-2, -1):
                if nextJump > 0 and position+nextJump in stoneSet and backtrack(position+nextJump, nextJump):
                    return True
            return False
        
        stoneSet = set(stones)
        return backtrack(0, 1)
    
