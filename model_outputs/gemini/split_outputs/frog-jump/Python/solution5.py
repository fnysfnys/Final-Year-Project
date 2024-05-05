def canCross(self, stones):
    n = len(stones)
    def dfs(i, lastJump):
        if i == n - 1:
            return True
        if stones[i + lastJump] > stones[i]:
            return dfs(i + lastJump, lastJump) or dfs(i + lastJump, lastJump - 1) or dfs(i + lastJump, lastJump + 1)
        return False
    return dfs(0, 1)
