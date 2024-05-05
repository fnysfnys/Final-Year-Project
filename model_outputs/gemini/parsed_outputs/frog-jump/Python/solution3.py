class Solution(object):
    def canCross(self, stones):
        def dfs(i, lastJump):
            if i == len(stones) - 1:
                return True
            for newJump in range(lastJump - 1, lastJump + 2):
                if 0 <= i + newJump < len(stones) and stones[i + newJump] > stones[i]:
                    if dfs(i + newJump, newJump):
                        return True
            return False
        return dfs(0, 1)
    
