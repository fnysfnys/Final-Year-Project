function countDigitOne(n) {
   if (n < 10) {
       return n % 10 === 1 ? 1 : 0;
   } else {
       return countDigitOne(n / 10) + (n % 10 === 1 ? 1 : 0);
   }
}
