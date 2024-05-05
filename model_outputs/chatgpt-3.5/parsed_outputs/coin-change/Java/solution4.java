class Solution {
    public int coinChange(int[] coins, int amount) {
        return coinChangeHelper(coins, amount);
    }
    
    private int coinChangeHelper(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        
        int minCoins = Integer.MAX_VALUE;
        
        for (int coin : coins) {
            int subProblem = coinChangeHelper(coins, amount - coin);
            if (subProblem != -1) {
                minCoins = Math.min(minCoins, subProblem + 1);
            }
        }
        
        return (minCoins == Integer.MAX_VALUE) ? -1 : minCoins;
    }
}
