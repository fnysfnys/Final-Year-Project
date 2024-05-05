class Solution {
    public int coinChange(int[] coins, int amount) {
       int minCoins = Integer.MAX_VALUE;
       for (int i = 0; i < coins.length; i++) {
           int coinsNeeded = amount / coins[i];
           if (coinsNeeded < minCoins) {
               minCoins = coinsNeeded;
           }
       }
       return minCoins;
    }
    
}
