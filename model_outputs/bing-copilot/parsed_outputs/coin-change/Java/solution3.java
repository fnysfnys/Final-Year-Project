class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] memo = new int[coins.length + 1][amount + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return coinChangeRec(coins, coins.length, amount, memo);
    }

    private int coinChangeRec(int[] coins, int n, int amount, int[][] memo) {
        if (amount == 0)
            return 0;
        if (n <= 0 || amount < 0)
            return -1;
        if (memo[n][amount] != -1)
            return memo[n][amount];

        int includeCoin = coinChangeRec(coins, n, amount - coins[n - 1], memo);
        int excludeCoin = coinChangeRec(coins, n - 1, amount, memo);

        if (includeCoin == -1)
            memo[n][amount] = excludeCoin;
        else if (excludeCoin == -1)
            memo[n][amount] = includeCoin + 1;
        else
            memo[n][amount] = Math.min(includeCoin + 1, excludeCoin);

        return memo[n][amount];
    }
}
