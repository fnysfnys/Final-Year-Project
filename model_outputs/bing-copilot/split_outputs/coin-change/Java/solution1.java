class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount < 0)
            return -1;
        return coinChangeRec(coins, coins.length - 1, amount);
    }

    private int coinChangeRec(int[] coins, int n, int amount) {
        if (amount == 0)
            return 0;
        if (n < 0)
            return -1;

        int includeCoin = coinChangeRec(coins, n, amount - coins[n]);
        int excludeCoin = coinChangeRec(coins, n - 1, amount);

        if (includeCoin == -1)
            return excludeCoin;
        if (excludeCoin == -1)
            return includeCoin + 1;

        return Math.min(includeCoin + 1, excludeCoin);
    }
}
