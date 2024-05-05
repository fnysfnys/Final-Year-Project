class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int count = 0;
        int[][] dp = new int[n][n];
        for (int i = 2; i < n; i++) {
            for (int j = i - 1; j > 0; j--) {
                for (int k = j - 1; k >= 0; k--) {
                    if ((long) nums[j] - nums[k] == (long) nums[i] - nums[j]) {
                        dp[j][i] = dp[k][j] + 1;
                        count += dp[j][i] >= 1 ? 1 : 0;
                    }
                }
            }
        }
        return count;
    }
}
