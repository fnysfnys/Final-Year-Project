function* nthUglyNumber(n) {
   let uglyNumber = 1;
   while (true) {
       yield uglyNumber;
       uglyNumber *= 2;
   }
}
