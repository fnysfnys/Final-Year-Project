class Solution(object):
    def canCross(self, stones):
        dp = [set() for _ in range(len(stones))]
        dp[0].add(0)
        for i in range(len(stones)):
            for j in dp[i]:
                for jump in [j - 1, j, j + 1]:
                    if jump > 0 and stones[i] + jump in stones:
                        dp[stones.index(stones[i] + jump)].add(jump)
        return bool(dp[-1])

# Example usage (same as above)
