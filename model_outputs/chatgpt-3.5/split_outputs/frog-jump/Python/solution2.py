class Solution(object):
    def canCross(self, stones):
        dp = {}
        def dfs(pos, jump):
            if pos == stones[-1]:
                return True
            if (pos, jump) in dp:
                return dp[(pos, jump)]
            for next_jump in (jump - 1, jump, jump + 1):
                if next_jump > 0 and pos + next_jump in stones:
                    if dfs(pos + next_jump, next_jump):
                        dp[(pos, jump)] = True
                        return True
            dp[(pos, jump)] = False
            return False
        
        return dfs(0, 1)
