public int coinChange(int[] coins, int amount) {
    Arrays.sort(coins);
    int result = coinChange(coins, amount, coins.length - 1);
    return result == Integer.MAX_VALUE ? -1 : result;
}

private int coinChange(int[] coins, int amount, int index) {
    if (amount == 0) return 0;
    if (index < 0 || amount < 0) return Integer.MAX_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i <= amount / coins[index]; i++) {
        int next = coinChange(coins, amount - i * coins[index], index - 1);
        if (next != Integer.MAX_VALUE) {
            min = Math.min(min, next + i);
        }
    }
    return min;
}
