var maxCoins = function(nums) {
  const n = nums.length;
  const dp = Array(n + 2).fill(0); // Padded for boundary handling
  for (let i = 1; i <= n; i++) {
    dp[i] = nums[i - 1];
  }

  for (let len = 1; len <= n; len++) {
    for (let left = 1; left + len - 1 <= n; left++) {
      let max = 0;
      for (let i = left; i <= left + len - 1; i++) {
        const burst = dp[left - 1] * dp[i] * dp[left + len];
        max = Math.max(max, burst + dp[i - 1] + dp[i + 1]);
      }
      dp[left + len - 1] = max;
    }
  }

  return dp[n];
};
