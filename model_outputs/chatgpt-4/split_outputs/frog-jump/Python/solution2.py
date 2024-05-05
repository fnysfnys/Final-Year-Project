def canCross(stones):
    memo = {}
    def dfs(position, lastJump):
        if (position, lastJump) in memo:
            return memo[(position, lastJump)]
        if position == stones[-1]:
            return True
        if position not in stoneSet:
            return False
        for jump in range(lastJump-1, lastJump+2):
            if jump > 0 and dfs(position+jump, jump):
                memo[(position, lastJump)] = True
                return True
        memo[(position, lastJump)] = False
        return False
    
    stoneSet = set(stones)
    return dfs(stones[0], 1)
