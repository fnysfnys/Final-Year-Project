function nthSuperUglyNumber(n, primes) {
   let uglyNumber = 1;
   for (let i = 0; i < n; i++) {
       uglyNumber *= primes[i % primes.length];
   }
   return uglyNumber;
}
