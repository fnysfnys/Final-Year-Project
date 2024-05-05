function poorPigs(buckets, minutesToDie, minutesToTest) {
  const dp = [];
  for (let i = 0; i <= minutesToTest; i++) {
    dp[i] = new Array(buckets + 1).fill(0);
  }

  for (let i = 1; i <= minutesToTest; i++) {
    for (let j = 1; j <= buckets; j++) {
      if (j === 1) {
        dp[i][j] = 1;
      } else if (i <= minutesToDie) {
        dp[i][j] = Math.ceil(i / minutesToDie);
      } else {
        dp[i][j] = Math.min(dp[i - minutesToDie][j - 1] + 1, dp[i][j - 1]);
      }
    }
  }

  return dp[minutesToTest][buckets];
}
