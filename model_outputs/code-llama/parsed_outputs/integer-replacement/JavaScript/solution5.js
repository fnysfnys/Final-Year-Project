function integerReplacement(n) {
   let dp = new Array(n + 1);
   dp[0] = 0;
   for (let i = 1; i <= n; i++) {
       if (i % 2 === 0) {
           dp[i] = 1 + dp[i / 2];
       } else {
           dp[i] = 1 + dp[i + 1];
       }
   }
   return dp[n];
}
