function countNumbersWithUniqueDigits(n) {
   let count = 0;
   for (let i = 0; i < 10 ** n; i++) {
       let digits = i.toString().split('');
       let uniqueDigits = new RegExp('^[0-9]{' + digits.length + '}$').test(digits.join(''));
       if (uniqueDigits) {
           count++;
       }
   }
   return count;
}
