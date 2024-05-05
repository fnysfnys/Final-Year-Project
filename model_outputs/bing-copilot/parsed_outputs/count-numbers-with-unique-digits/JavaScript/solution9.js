   var countNumbersWithUniqueDigits = function(n) {
       let result = 1;
       for (let i = 0; i < n; i++) {
           result += 9 * Math.pow(9, i);
       }
       return result;
   };
   