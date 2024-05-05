function nthSuperUglyNumber(n, primes) {
   let list = new LinkedList();
   let uglyNumber = 1;
   for (let i = 0; i < n; i++) {
       uglyNumber *= primes[i % primes.length];
       list.add(uglyNumber);
   }
   return uglyNumber;
}
