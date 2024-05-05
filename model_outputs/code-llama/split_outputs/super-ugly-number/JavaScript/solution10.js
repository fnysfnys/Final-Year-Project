function nthSuperUglyNumber(n, primes) {
   let queue = [];
   let uglyNumber = 1;
   for (let i = 0; i < n; i++) {
       uglyNumber *= primes[i % primes.length];
       queue.push(uglyNumber);
   }
   return uglyNumber;
}
