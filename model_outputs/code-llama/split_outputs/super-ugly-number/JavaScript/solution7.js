function nthSuperUglyNumber(n, primes) {
   let tree = new BinarySearchTree();
   let uglyNumber = 1;
   for (let i = 0; i < n; i++) {
       uglyNumber *= primes[i % primes.length];
       tree.insert(uglyNumber);
   }
   return uglyNumber;
}
