function* nthUglyNumber(n) {
   let uglyNumber = 1;
   while (true) {
       if (uglyNumber % 2 === 0) {
           uglyNumber *= 2;
       } else if (uglyNumber % 3 === 0) {
           uglyNumber *= 3;
       } else if (uglyNumber % 5 === 0) {
           uglyNumber *= 5;
       }
       yield uglyNumber;
   }
}
