class Solution(object):
    def canCross(self, stones):
        def dfs(pos, jump):
            if pos == len(stones) - 1:
                return True
            if (pos, jump) in memo:
                return memo[(pos, jump)]
            for next_jump in [jump - 1, jump, jump + 1]:
                if next_jump > 0 and pos + next_jump in stones:
                    if dfs(pos + next_jump, next_jump):
                        memo[(pos, jump)] = True
                        return True
            memo[(pos, jump)] = False
            return False
        
        memo = {}
        return dfs(0, 0)

# Example usage (same as above)
