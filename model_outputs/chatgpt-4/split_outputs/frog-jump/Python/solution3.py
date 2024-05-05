def canCross(stones):
    dp = {stone: set() for stone in stones}
    dp[0].add(0)
    for stone in stones:
        for lastJump in dp[stone]:
            for jump in range(lastJump-1, lastJump+2):
                if jump > 0 and stone+jump in dp:
                    dp[stone+jump].add(jump)
    return bool(dp[stones[-1]])
