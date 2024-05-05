var canPartition = function(nums) {
  const totalSum = nums.reduce((a, b) => a + b, 0);
  if (totalSum % 2 !== 0) return false;

  const dp = new Array(totalSum / 2 + 1).fill(false);
  dp[0] = true;

  for (const num of nums) {
    for (let i = totalSum / 2; i >= num; i--) {
      dp[i] = dp[i] || dp[i - num];
    }
  }

  return dp[totalSum / 2];
};
