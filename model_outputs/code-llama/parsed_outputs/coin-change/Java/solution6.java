class Solution {
    public int coinChange(int[] coins, int amount) {
       if (amount == 0) {
           return 0;
       }
       int minCoins = Integer.MAX_VALUE;
       for (int i = 0; i < coins.length; i++) {
           if (amount >= coins[i]) {
               int coinsNeeded = coinChange(coins, amount - coins[i]);
               if (coinsNeeded < minCoins) {
                   minCoins = coinsNeeded;
               }
           }
       }
       return minCoins + 1;
    }
    
}
