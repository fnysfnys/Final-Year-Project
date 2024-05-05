function findSubstringInWraproundString(s) {
  const n = s.length;
  const dp = new Array(n + 1).fill(0);
  let maxLen = 0;
  
  for (let i = 1; i <= n; i++) {
    if (i > 1 && (s.charCodeAt(i - 1) - s.charCodeAt(i - 2) + 26) % 26 === 1) {
      maxLen++;
    } else {
      maxLen = 1;
    }
    dp[i] = Math.max(dp[i], maxLen);
  }
  
  return dp.slice(1).reduce((acc, curr) => acc + curr, 0);
}
