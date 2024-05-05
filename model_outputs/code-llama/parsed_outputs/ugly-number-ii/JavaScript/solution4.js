function nthUglyNumber(n) {
   if (n === 1) {
       return 1;
   }
   return nthUglyNumber(n - 1) * 2;
}
