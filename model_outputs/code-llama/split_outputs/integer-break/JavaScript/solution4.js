function integerBreak(n) {
   const dp = new Array(n + 1).fill(1);
   for (let i = 2; i <= n; i++) {
       for (let j = 1; j < i; j++) {
           dp[i] = Math.max(dp[i], dp[j] * dp[i - j]);
       }
   }
   return dp[n];
}
