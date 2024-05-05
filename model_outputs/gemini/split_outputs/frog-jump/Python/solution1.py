def canCross(self, stones):
    n = len(stones)
    dp = [[False] * n for _ in range(n)]
    dp[0][0] = True
    for i in range(1, n):
        for j in range(i):
            if stones[j] + j - 1 <= stones[i] < stones[j] + j + 1:
                dp[i][j] = dp[j][j - 1] or dp[j][j] or dp[j][j + 1]
    return any(dp[-1])
