public int lengthOfLIS(int[] nums) {
  int n = nums.length;
  int[] dp = new int[n];
  int max = 0;

  for (int i = 0; i < n; i++) {
    dp[i] = 1; // Minimum LIS starting at i is 1 (itself)
    for (int j = 0; j < i; j++) {
      if (nums[i] > nums[j]) {
        dp[i] = Math.max(dp[i], dp[j] + 1);
      }
    }
    max = Math.max(max, dp[i]);
  }

  return max;
}
