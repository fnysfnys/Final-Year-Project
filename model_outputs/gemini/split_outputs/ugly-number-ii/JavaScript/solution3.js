var nthUglyNumber = function(n) {
  const dp = new Array(n + 1).fill(0);
  dp[1] = 1;
  let i2 = i3 = i5 = 1;
  for (let i = 2; i <= n; i++) {
    dp[i] = Math.min(dp[i2] * 2, Math.min(dp[i3] * 3, dp[i5] * 5));
    if (dp[i] === dp[i2] * 2) i2++;
    if (dp[i] === dp[i3] * 3) i3++;
    if (dp[i] === dp[i5] * 5) i5++;
  }
  return dp[n];
};
