def canCross(stones):
    stoneDict = {stone: i for i, stone in enumerate(stones)}
    def dfs(index, lastJump):
        if index == len(stones) - 1:
            return True
        for jump in range(lastJump-1, lastJump+2):
            nextIndex = stoneDict.get(stones[index] + jump, None)
            if jump > 0 and nextIndex is not None and dfs(nextIndex, jump):
                return True
       

 return False
    
    return dfs(0, 1)
