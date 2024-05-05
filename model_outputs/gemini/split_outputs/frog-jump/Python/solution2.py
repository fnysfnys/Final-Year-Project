def canCross(self, stones, memo={}):
    n = len(stones)
    def dfs(i, lastJump):
        if i == n - 1:
            return True
        if (i, lastJump) in memo:
            return memo[(i, lastJump)]
        for newJump in range(lastJump - 1, lastJump + 2):
            if 0 <= i + newJump < n and stones[i + newJump] > stones[i]:
                if dfs(i + newJump, newJump):
                    memo[(i, lastJump)] = True
                    return True
        memo[(i, lastJump)] = False
        return False
    return dfs(0, 1)
