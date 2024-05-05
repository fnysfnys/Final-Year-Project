class Solution(object):
    def canCross(self, stones):
        import bisect
        def isPossible(position, jump):
            nextPosition = position + jump
            index = bisect.bisect_left(stones, nextPosition)
            return index < len(stones) and stones[index] == nextPosition
        
        def dfs(position, lastJump):
            if position == stones[-1]:
                return True
            for jump in range(lastJump-1, lastJump+2):
                if jump > 0 and isPossible(position, jump) and dfs(position+jump, jump):
                    return True
            return False
        
        return dfs(0, 1)
    
