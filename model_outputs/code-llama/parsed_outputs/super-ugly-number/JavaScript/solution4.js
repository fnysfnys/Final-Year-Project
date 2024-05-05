function nthSuperUglyNumber(n, primes) {
   let dp = [1];
   for (let i = 1; i < n; i++) {
       let uglyNumber = 1;
       for (let j = 0; j < primes.length; j++) {
           uglyNumber *= primes[j];
       }
       dp[i] = uglyNumber;
   }
   return dp[n - 1];
}
