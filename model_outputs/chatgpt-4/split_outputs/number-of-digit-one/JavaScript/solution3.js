   /**
    * Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
    */
   var countDigitOne = function(n) {
       if (n <= 0) return 0;
       if (n < 10) return 1;
       let strN = n.toString();
       let firstDigit = parseInt(strN[0]);
       let remainder = parseInt(strN.substr(1));
       let count = countDigitOne(remainder);
       if (firstDigit === 1) count += remainder + 1;
       else count += Math.pow(10, strN.length - 1);
       return count + countDigitOne(Math.pow(10, strN.length - 1) - 1) * firstDigit;
   };
   