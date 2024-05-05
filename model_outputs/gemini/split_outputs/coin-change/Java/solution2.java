public int coinChange(int[] coins, int amount) {
  int[] dp = new int[amount + 1];
  Arrays.fill(dp, -1);
  return coinChangeHelper(coins, amount, dp);
}

private int coinChangeHelper(int[] coins, int amount, int[] dp) {
  if (amount == 0) return 0;
  if (amount < 0 || dp[amount] != -1) return dp[amount];
  int minCoins = Integer.MAX_VALUE;
  for (int coin : coins) {
    int result = coinChangeHelper(coins, amount - coin, dp);
    if (result != -1) {
      minCoins = Math.min(minCoins, result + 1);
    }
  }
  dp[amount] = minCoins == Integer.MAX_VALUE ? -1 : minCoins;
  return dp[amount];
}
