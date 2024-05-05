   var countNumbersWithUniqueDigits = function(n) {
       let counts = {};
       for (let i = 0; i < Math.pow(10, n); i++) {
           counts[i] = 1 + (counts[i] || 0);
       }
       return Object.keys(counts).length;
   };
   