class Solution {
    public int coinChange(int[] coins, int amount) {
      if (amount == 0) return 0;
      if (amount < 0) return -1;
      int minCoins = Integer.MAX_VALUE;
      for (int coin : coins) {
        int result = coinChange(coins, amount - coin);
        if (result != -1) {
          minCoins = Math.min(minCoins, result + 1);
        }
      }
      return minCoins == Integer.MAX_VALUE ? -1 : minCoins;
    }
    
}
