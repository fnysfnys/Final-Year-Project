public int coinChange(int[] coins, int amount) {
    if (amount < 1) return 0;
    return coinChange(coins, amount, 0);
}

private int coinChange(int[] coins, int amount, int index) {
    if (amount == 0) return 0;
    if (index >= coins.length || amount < 0) return -1;
    int maxNumCoins = amount / coins[index];
    int minCost = Integer.MAX_VALUE;
    for (int x = 0; x <= maxNumCoins; x++) {
        int res = coinChange(coins, amount - x * coins[index], index + 1);
        if (res != -1) {
            minCost = Math.min(minCost, res + x);
        }
    }
    return minCost == Integer.MAX_VALUE ? -1 : minCost;
}
