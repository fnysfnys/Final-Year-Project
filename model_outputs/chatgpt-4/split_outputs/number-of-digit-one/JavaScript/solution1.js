   /**
    * Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
    */
   var countDigitOne = function(n) {
       let count = 0;
       for (let i = 1; i <= n; i++) {
           let str = i.toString();
           for (let char of str) {
               if (char === '1') count++;
           }
       }
       return count;
   };
   