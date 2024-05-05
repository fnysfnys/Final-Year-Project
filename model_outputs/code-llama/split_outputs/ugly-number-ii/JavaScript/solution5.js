function nthUglyNumber(n) {
   if (n === 1) {
       return 1;
   }
   if (nthUglyNumber(n - 1) % 2 === 0) {
       return nthUglyNumber(n - 1) * 2;
   } else if (nthUglyNumber(n - 1) % 3 === 0) {
       return nthUglyNumber(n - 1) * 3;
   } else if (nthUglyNumber(n - 1) % 5 === 0) {
       return nthUglyNumber(n - 1) * 5;
   }
   return nthUglyNumber(n - 1);
}
