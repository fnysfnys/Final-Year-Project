def canCross(stones):
    def dfs(position, lastJump):
        if position == stones[-1]:
            return True
        if position not in stoneSet:
            return False
        for jump in range(lastJump-1, lastJump+2):
            if jump > 0 and dfs(position+jump, jump):
                return True
        return False
    
    stoneSet = set(stones)
    return dfs(stones[0], 1)
