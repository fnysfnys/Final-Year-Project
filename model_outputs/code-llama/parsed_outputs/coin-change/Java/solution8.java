class Solution {
    public int coinChange(int[] coins, int amount) {
       int coinsNeeded = 0;
       for (int i = 0; i < coins.length; i++) {
           while (amount >= coins[i]) {
               amount -= coins[i];
               coinsNeeded++;
           }
       }
       return coinsNeeded;
    }
    
}
