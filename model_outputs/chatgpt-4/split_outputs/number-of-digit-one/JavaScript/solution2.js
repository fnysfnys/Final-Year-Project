   /**
    * Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
    */
   var countDigitOne = function(n) {
       let count = 0;
       for (let i = 0; i <= n; i++) {
           count += (i.toString().match(/1/g) || []).length;
       }
       return count;
   };
   