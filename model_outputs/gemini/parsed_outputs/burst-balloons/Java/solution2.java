class Solution {
    public int maxCoins(int[] nums) {
      int n = nums.length;
      int[][] dp = new int[n][n];
      for (int i = 0; i < n; i++) {
        Arrays.fill(dp[i], -1);
      }
      return solve(nums, 0, n - 1, dp);
    }
    
    private int solve(int[] nums, int i, int j, int[][] dp) {
      if (i > j) return 0;
      if (dp[i][j] != -1) return dp[i][j];
    
      int max = 0;
      for (int k = i; k <= j; k++) {
        int left = solve(nums, i, k - 1, dp);
        int right = solve(nums, k + 1, j, dp);
        int current = (i == 0 ? 1 : nums[i - 1]) * nums[k] * (j == nums.length - 1 ? 1 : nums[j + 1]);
        max = Math.max(max, left + current + right);
      }
      dp[i][j] = max;
      return max;
    }
    
}
