var numDistinct = function(s, t) {
  const m = s.length, n = t.length;
  const dp = new Array(m + 1).fill(0).map(() => new Array(n + 1).fill(0));
  
  for (let i = 0; i <= m; i++) {
    dp[i][0] = 1; // Empty subsequence matches empty string
  }
  
  for (let i = 1; i <= m; i++) {
    for (let j = 1; j <= n; j++) {
      dp[i][j] = dp[i - 1][j]; // Skip current char in s
      if (s[i - 1] === t[j - 1]) {
        dp[i][j] += dp[i - 1][j - 1]; // Include current char if matches
      }
    }
  }
  
  return dp[m][n];
};
