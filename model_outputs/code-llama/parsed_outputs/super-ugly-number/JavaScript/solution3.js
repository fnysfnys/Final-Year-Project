function nthSuperUglyNumber(n, primes) {
   let memo = {};
   function helper(n, primes) {
       if (n === 1) {
           return 1;
       }
       if (memo[n]) {
           return memo[n];
       }
       let uglyNumber = 1;
       for (let i = 0; i < primes.length; i++) {
           uglyNumber *= primes[i];
       }
       memo[n] = uglyNumber * helper(n - 1, primes);
       return memo[n];
   }
   return helper(n, primes);
}
