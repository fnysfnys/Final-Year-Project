class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int numCoins = 0;
        int remainingAmount = amount;
        
        for (int i = coins.length - 1; i >= 0; i--) {
            while (remainingAmount >= coins[i]) {
                remainingAmount -= coins[i];
                numCoins++;
            }
        }
        
        return (remainingAmount == 0) ? numCoins : -1;
    }
}
