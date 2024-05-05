public int coinChange(int[] coins, int amount) {
    if (amount < 1) return 0;
    return coinChange(coins, amount, new Integer[amount + 1]);
}

private int coinChange(int[] coins, int rem, Integer[] dp) {
    if (rem < 0) return -1;
    if (rem == 0

 return 0;
    if (dp[rem] != null) return dp[rem];
    int min = Integer.MAX_VALUE;
    for (int coin : coins) {
        int res = coinChange(coins, rem - coin, dp);
        if (res >= 0 && res < min) {
            min = res + 1;
        }
    }
    dp[rem] = (min == Integer.MAX_VALUE) ? -1 : min;
    return dp[rem];
}
