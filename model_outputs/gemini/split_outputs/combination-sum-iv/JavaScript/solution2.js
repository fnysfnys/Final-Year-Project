function combinationSum4(nums, target) {
  const dp = Array(target + 1).fill(0).map(() => Array(nums.length).fill(0));
  for (let i = 0; i < nums.length; i++) {
    dp[nums[i]][i] = 1;
  }
  for (let i = 1; i <= target; i++) {
    for (let j = 0; j < nums.length; j++) {
      for (let k = 0; k < j; k++) {
        if (i >= nums[j] && dp[i - nums[j]][k] > 0) {
          dp[i][j] += dp[i - nums[j]][k];
        }
      }
    }
  }
  return dp[target].reduce((a, b) => a + b, 0);
}
