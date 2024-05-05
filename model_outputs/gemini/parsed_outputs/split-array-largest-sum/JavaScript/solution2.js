function splitArray(nums, k) {
  const dp = Array(nums.length + 1).fill(Number.MAX_VALUE, 0, k + 1);
  dp[0] = 0;

  for (let i = 1; i <= nums.length; i++) {
    let minSum = Number.MAX_VALUE;
    for (let j = 1; j <= k && i >= j; j++) {
      minSum = Math.min(minSum, dp[j - 1] + Math.max(...nums.slice(i - j, i)));
    }
    dp[i] = minSum;
  }

  return dp[nums.length];
}
