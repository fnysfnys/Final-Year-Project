   /**
    * Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
    */
   var countDigitOne = function(n) {
       return Array.from({length: n + 1}, (_, i) => i)
                   .join('')
                   .match(/1/g)?.length || 0;
   };
   