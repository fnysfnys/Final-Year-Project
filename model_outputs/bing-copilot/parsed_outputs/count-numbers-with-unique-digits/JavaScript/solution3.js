   var countNumbersWithUniqueDigits = function(n) {
       return Array.from({ length: Math.pow(10, n) })
           .filter((_, i, arr) => i === arr.lastIndexOf(i))
           .length;
   };
   