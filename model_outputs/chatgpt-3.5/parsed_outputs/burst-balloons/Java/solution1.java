class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] paddedNums = new int[n + 2];
        paddedNums[0] = 1;
        paddedNums[n + 1] = 1;
        for (int i = 1; i <= n; i++) {
            paddedNums[i] = nums[i - 1];
        }
        int[][] dp = new int[n + 2][n + 2];
        return burstBalloons(paddedNums, dp, 1, n);
    }
    
    private int burstBalloons(int[] nums, int[][] dp, int left, int right) {
        if (left > right) {
            return 0;
        }
        if (dp[left][right] > 0) {
            return dp[left][right];
        }
        int maxCoins = 0;
        for (int i = left; i <= right; i++) {
            int coins = nums[left - 1] * nums[i] * nums[right + 1];
            coins += burstBalloons(nums, dp, left, i - 1);
            coins += burstBalloons(nums, dp, i + 1, right);
            maxCoins = Math.max(maxCoins, coins);
        }
        dp[left][right] = maxCoins;
        return maxCoins;
    }
}
