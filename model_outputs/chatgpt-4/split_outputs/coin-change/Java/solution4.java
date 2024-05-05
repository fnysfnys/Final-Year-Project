public int coinChange(int[] coins, int amount) {
    Arrays.sort(coins);
    int result = coinChange(coins, amount, coins.length - 1, 0);
    return result == Integer.MAX_VALUE ? -1 : result;
}

private int coinChange(int[] coins, int amount, int index, int count) {
    if (index < 0) return Integer.MAX_VALUE;
    if (amount == 0) return count;
    int maxVal = amount / coins[index];
    int minCost = Integer.MAX_VALUE;
    for (int x = maxVal; x >= 0; x--) {
        if (count + x < minCost) {
            int res = coinChange(coins, amount - (x * coins[index]), index - 1, count + x);
            if (res != Integer.MAX_VALUE) {
                minCost = res;
            }
        }
    }
    return minCost;
}
