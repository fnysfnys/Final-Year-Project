function countNumbersWithUniqueDigits(n) {
   let count = 0;
   for (let i = 0; i < 10 ** n; i++) {
       let digits = i.toString().split('');
       let uniqueDigits = new Set(digits);
       if (uniqueDigits.size === digits.length) {
           count++;
       }
   }
   return count;
}
