function integerBreak(n) {
   const memo = new Array(n + 1).fill(1);
   for (let i = 2; i <= n; i++) {
       for (let j = 1; j < i; j++) {
           memo[i] = Math.max(memo[i], memo[j] * memo[i - j]);
       }
   }
   return memo[n];
}
