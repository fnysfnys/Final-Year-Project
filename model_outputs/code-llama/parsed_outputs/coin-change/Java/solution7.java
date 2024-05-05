class Solution {
    public int coinChange(int[] coins, int amount) {
       int[] memo = new int[amount + 1];
       Arrays.fill(memo, -1);
       return coinChange(coins, amount, memo);
    }
    
    private int coinChange(int[] coins, int amount, int[] memo) {
       if (amount == 0) {
           return 0;
       }
       if (memo[amount] != -1) {
           return memo[amount];
       }
       int minCoins = Integer.MAX_VALUE;
       for (int i = 0; i < coins.length; i++) {
           if (amount >= coins[i]) {
               int coinsNeeded = coinChange(coins, amount - coins[i], memo);
               if (coinsNeeded < minCoins) {
                   minCoins = coinsNeeded;
               }
           }
       }
       memo[amount] = minCoins + 1;
       return memo[amount];
    }
    
}
