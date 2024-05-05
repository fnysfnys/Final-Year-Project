class Solution {
    public int maxCoins(int[] nums) {
      int n = nums.length;
      int[] dp = new int[n + 2];
      Arrays.fill(dp, 1); // Handle edge cases
    
      for (int i = n - 1; i >= 0; i--) {
        for (int j = i + 1; j < n; j++) {
          int max = 0;
          for (int k = i + 1; k <= j; k++) {
            max = Math.max(max, dp[i] * nums[k] * dp[j + 1]);
          }
          dp[j] = max;
        }
      }
      return dp[1];
    }
    
}
