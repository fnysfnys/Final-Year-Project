function nthSuperUglyNumber(n, primes) {
   let hash = {};
   let uglyNumber = 1;
   for (let i = 0; i < n; i++) {
       uglyNumber *= primes[i % primes.length];
       hash[uglyNumber] = true;
   }
   return uglyNumber;
}
