function countNumbersWithUniqueDigits(n) {
  if (n === 0) return 1;
  const dp = [1, 10];
  for (let i = 2; i <= n; i++) {
    dp[i] = dp[i - 1] * (10 - i + 1);
  }
  return dp[n];
}
