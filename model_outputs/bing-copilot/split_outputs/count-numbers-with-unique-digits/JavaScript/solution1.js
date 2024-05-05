   var countNumbersWithUniqueDigits = function(n) {
       return new Set(Array.from({ length: Math.pow(10, n) }, (_, i) => i))
           .size;
   };
   