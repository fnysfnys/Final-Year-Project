public class Solution {
    /**
     * You are given coins of different denominations and a total amount of money. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
     * 
     * Example:
     * Input: coins = [1, 2, 5], amount = 11
     * Output: 3 
     * Explanation: 11 = 5 + 5 + 1
     */
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}