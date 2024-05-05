class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int count = 0;
        int i = coins.length - 1;

        while (amount > 0 && i >= 0) {
            if (coins[i] <= amount) {
                amount -= coins[i];
                count++;
            } else {
                i--;
            }
        }

        return amount == 0 ? count : -1;
    }
}
