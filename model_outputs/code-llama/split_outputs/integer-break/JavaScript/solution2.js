function integerBreak(n) {
   if (n === 1) {
       return 1;
   }
   let result = 1;
   for (let i = 2; i <= n; i++) {
       result *= integerBreak(i);
   }
   return result;
}
