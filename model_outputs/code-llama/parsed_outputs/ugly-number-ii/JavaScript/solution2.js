function nthUglyNumber(n) {
   let uglyNumber = 1;
   for (let i = 1; i < n; i++) {
       if (uglyNumber % 2 === 0) {
           uglyNumber *= 2;
       } else if (uglyNumber % 3 === 0) {
           uglyNumber *= 3;
       } else if (uglyNumber % 5 === 0) {
           uglyNumber *= 5;
       }
   }
   return uglyNumber;
}
