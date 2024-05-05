function countDigitOne(n) {
   return Math.floor(n / 10) + (n % 10 === 1 ? 1 : 0);
}
