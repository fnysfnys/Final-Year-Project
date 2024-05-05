class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] paddedNums = new int[n + 2];
        paddedNums[0] = 1;
        paddedNums[n + 1] = 1;
        for (int i = 1; i <= n; i++) {
            paddedNums[i] = nums[i - 1];
        }
        int[][] memo = new int[n + 2][n + 2];
        int maxCoins = 0;
        while (n > 0) {
            int maxIdx = -1;
            int maxVal = Integer.MIN_VALUE;
            for (int i = 1; i <= n; i++) {
                int coins = paddedNums[i - 1] * paddedNums[i] * paddedNums[i + 1];
                coins += memo[1][i - 1] + memo[i + 1][n + 1];
                if (coins > maxVal) {
                    maxVal = coins;
                    maxIdx = i;
                }
            }
            maxCoins += maxVal;
            for (int i = maxIdx; i <= n; i++) {
                paddedNums[i] = paddedNums[i + 1];
            }
            n--;
        }
        return maxCoins;
    }
}
