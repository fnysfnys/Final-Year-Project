public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
    if (desiredTotal <= 0) {
        return false;
    }
    boolean[] dp = new boolean[desiredTotal + 1];
    dp[0] = true;
    for (int i = 1; i <= desiredTotal; i++) {
        for (int j = 1; j <= maxChoosableInteger && j < i; j++) {
            if (!dp[i - j]) {
                dp[i] = true;
                break;
            }
        }
    }
    return dp[desiredTotal];
}
