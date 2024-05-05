   var countNumbersWithUniqueDigits = function(n) {
       if (n === 0) return 1;
       let result = 10;
       let uniqueDigits = 9;
       for (let i = 2; i <= n; i++) {
           uniqueDigits *= 11 - i;
           result += uniqueDigits;
       }
       return result;
   };
   