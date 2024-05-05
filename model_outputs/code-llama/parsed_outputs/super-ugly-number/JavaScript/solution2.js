function nthSuperUglyNumber(n, primes) {
   if (n === 1) {
       return 1;
   }
   let uglyNumber = 1;
   for (let i = 0; i < primes.length; i++) {
       uglyNumber *= primes[i];
   }
   return uglyNumber * nthSuperUglyNumber(n - 1, primes);
}
