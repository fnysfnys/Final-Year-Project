public int combinationSum4(int[] nums, int target) {
  int[] dp = new int[target + 1];
  dp[0] = 1;
  for (int num : nums) {
    for (int i = num; i <= target; i++) {
      dp[i] |= dp[i - num];
    }
  }
  return dp[target];
}
