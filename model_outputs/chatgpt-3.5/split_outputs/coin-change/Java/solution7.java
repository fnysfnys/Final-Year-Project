public int coinChange(int amount, int[] coins) {
    int[] memo = new int[amount + 1];
    Arrays.fill(memo, -1);
    return coinChangeHelper(amount, coins, memo);
}

private int coinChangeHelper(int amount, int[] coins, int[] memo) {
    if (amount == 0) return 0;
    if (amount < 0) return -1;
    if (memo[amount] != -1) return memo[amount];
    
    int minCoins = Integer.MAX_VALUE;
    
    for (int coin : coins) {
        int subProblem = coinChangeHelper(amount - coin, coins, memo);
        if (subProblem != -1) {
            minCoins = Math.min(minCoins, subProblem + 1);
        }
    }
    
    memo[amount] = (minCoins == Integer.MAX_VALUE) ? -1 : minCoins;
    return memo[amount];
}
