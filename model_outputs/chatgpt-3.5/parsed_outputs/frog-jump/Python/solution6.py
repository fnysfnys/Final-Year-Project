class Solution(object):
    def canCross(self, stones):
        memo = [[False] * len(stones) for _ in range(len(stones))]
        def dfs(pos, jump):
            if pos == len(stones) - 1:
                return True
            if memo[pos][jump]:
                return False
            for next_jump in (jump - 1, jump, jump + 1):
                if next_jump > 0 and pos + next_jump < len(stones) and stones[pos + next_jump] - stones[pos] <= next_jump:
                    if dfs(pos + next_jump, next_jump):
                        return True
            memo[pos][jump] = True
            return False
        
        return dfs(0, 0)