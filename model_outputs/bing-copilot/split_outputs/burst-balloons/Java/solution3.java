class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[][] memo = new int[n][n];
        return getMaxCoins(nums, memo, 0, n - 1);
    }

    private int getMaxCoins(int[] nums, int[][] memo, int start, int end) {
        if (start > end) {
            return 0;
        }
        if (memo[start][end] != 0) {
            return memo[start][end];
        }
        int maxCoins = 0;
        for (int i = start; i <= end; i++) {
            int left = (start == 0) ? 1 : nums[start - 1];
            int right = (end == nums.length - 1) ? 1 : nums[end + 1];
            int coins = left * nums[i] * right;
            maxCoins = Math.max(maxCoins, coins + getMaxCoins(nums, memo, start, i - 1) + getMaxCoins(nums, memo, i + 1, end));
        }
        memo[start][end] = maxCoins;
        return maxCoins;
    }
}
