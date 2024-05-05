function countDigitOne(n) {
   let count = 0;
   for (let i = 1; i <= n; i++) {
       if (i % 10 === 1) {
           count++;
       }
   }
   return count;
}
