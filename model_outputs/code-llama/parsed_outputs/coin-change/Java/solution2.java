class Solution {
    public int coinChange(int[] coins, int amount) {
       int[] dp = new int[amount + 1];
       for (int i = 1; i <= amount; i++) {
           int minCoins = Integer.MAX_VALUE;
           for (int j = 0; j < coins.length; j++) {
               if (i >= coins[j]) {
                   minCoins = Math.min(minCoins, dp[i - coins[j]] + 1);
               }
           }
           dp[i] = minCoins;
       }
       return dp[amount];
    }
    
}
