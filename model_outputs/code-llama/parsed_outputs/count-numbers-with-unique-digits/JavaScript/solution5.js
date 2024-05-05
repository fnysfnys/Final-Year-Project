function countNumbersWithUniqueDigits(n) {
   let count = 0;
   for (let i = 0; i < 10 ** n; i++) {
       let digits = i.toString().split('');
       let uniqueDigits = new Map();
       for (let j = 0; j < digits.length; j++) {
           if (!uniqueDigits.has(digits[j])) {
               uniqueDigits.set(digits[j], 1);
           }
       }
       if (uniqueDigits.size === digits.length) {
           count++;
       }
   }
   return count;
}
