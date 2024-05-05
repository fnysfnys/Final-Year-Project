function nthUglyNumber(n) {
   let uglyNumber = 1;
   for (let i = 1; i < n; i++) {
       uglyNumber *= 2;
   }
   return uglyNumber;
}
