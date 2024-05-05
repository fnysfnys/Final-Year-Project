function integerReplacement(n) {
  const dp = new Array(n + 1).fill(Infinity);
  dp[1] = 0;
  for (let i = 2; i <= n; i++) {
    if (i % 2 === 0) {
      dp[i] = Math.min(dp[i], dp[i / 2] + 1);
    } else {
      dp[i] = Math.min(dp[i], dp[i + 1] + 1, dp[i - 1] + 1);
    }
  }
  return dp[n];
}
