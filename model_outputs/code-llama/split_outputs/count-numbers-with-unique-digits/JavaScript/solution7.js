function countNumbersWithUniqueDigits(n) {
   let count = 0;
   for (let i = 0; i < 10 ** n; i++) {
       let digits = i.toString().split('');
       let uniqueDigits = 0;
       for (let j = 0; j < digits.length; j++) {
           uniqueDigits |= 1 << digits[j];
       }
       if (uniqueDigits === (1 << digits.length) - 1) {
           count++;
       }
   }
   return count;
}
