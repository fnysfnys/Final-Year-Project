function countNumbersWithUniqueDigits(n) {
   if (n === 0) {
       return 1;
   }
   let count = 0;
   for (let i = 0; i < 10; i++) {
       count += countNumbersWithUniqueDigits(n - 1);
   }
   return count;
}
