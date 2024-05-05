public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
    if (desiredTotal <= 0) return true;
    int sum = (maxChoosableInteger * (maxChoosableInteger + 1)) / 2;
    if (sum < desiredTotal) return false;

    boolean[] dp = new boolean[1 << maxChoosableInteger];
    for (int i = 0; i < (1 << maxChoosableInteger); i++) {
        int total = 0;
        for (int j = 0; j < maxChoosableInteger; j++) {
            if ((i & (1 << j)) != 0) {
                total += j + 1;
            }
        }
        if (total >= desiredTotal) continue;
        for (int j = 0; j < maxChoosableInteger; j++) {
            if ((i & (1 << j)) == 0 && !dp[i | (1 << j)]) {
                dp[i] = true;
                break;
            }
        }
    }
    return dp[0];
}
