def canCross(stones):
    def dfs(position, lastJump):
        if position >= stones[-1]:
            return position == stones[-1]
        for jump in range(lastJump-1, lastJump+2):
            if jump > 0 and (position+jump in stoneSet) and dfs(position+jump, jump):
                return True
        return False
    
    stoneSet = set(stones)
    return dfs(0, 1)
