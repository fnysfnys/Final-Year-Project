public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
    int n = (1 << maxChoosableInteger) - 1;
    if (desiredTotal > (n * n + n) / 2) {
        return false;
    }
    int[] dp = new int[n + 1];
    for (int i = 1; i <= n; i++) {
        for (int j = 0; j < maxChoosableInteger; j++) {
            int mask = 1 << j;
            if ((i & mask) == 0 && !((dp[i ^ mask] & 2) == 2)) {
                dp[i] |= 1;
                break;
            }
        }
        dp[i] |= 2;
    }
    return (dp[n] & 1) == 1;
}
