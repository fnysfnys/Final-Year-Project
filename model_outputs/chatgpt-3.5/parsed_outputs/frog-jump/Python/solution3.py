class Solution(object):
    def canCross(self, stones):
        dp = {}
        for stone in stones:
            dp[stone] = set()
        
        dp[0].add(0)
        for stone in stones:
            for prev_jump in dp[stone]:
                for next_jump in (prev_jump - 1, prev_jump, prev_jump + 1):
                    if next_jump > 0 and stone + next_jump in dp:
                        dp[stone + next_jump].add(next_jump)
        
        return bool(dp[stones[-1]])