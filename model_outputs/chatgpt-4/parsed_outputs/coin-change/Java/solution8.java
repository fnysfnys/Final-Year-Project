class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount < 1) return 0;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        
        for (int a = 1; a <= amount; a++) {
            for (int coin : coins) {
                if (coin <= a) {
                    dp[a] = Math.min(dp[a], dp[a - coin] + 1);
                }
            }
            if (dp[a] != amount + 1) {
                for (int coin : coins) {
                    if (a + coin <= amount) {
                        dp[a + coin] = Math.min(dp[a + coin], dp[a] + 1);
                    }
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
