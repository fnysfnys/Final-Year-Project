function countNumbersWithUniqueDigits(n) {
   let count = 0;
   for (let i = 0; i < 10 ** n; i++) {
       let digits = i.toString().split('');
       let uniqueDigits = [];
       for (let j = 0; j < digits.length; j++) {
           if (!uniqueDigits.includes(digits[j])) {
               uniqueDigits.push(digits[j]);
           }
       }
       if (uniqueDigits.length === digits.length) {
           count++;
       }
   }
   return count;
}
