   var countNumbersWithUniqueDigits = function(n) {
       const memo = new Map();
       const helper = (n) => {
           if (n === 0) return 1;
           if (memo.has(n)) return memo.get(n);
           const result = 10 * helper(n - 1) - 9 * helper(n - 2);
           memo.set(n, result);
           return result;
       };
       return helper(n);
   };
   