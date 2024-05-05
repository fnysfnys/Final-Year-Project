   var countNumbersWithUniqueDigits = function(n) {
       const dp = Array(n + 1).fill(0);
       dp[0] = 1;
       for (let i = 1; i <= n; i++) {
           dp[i] = 9;
           for (let j = 9; j >= 9 - i + 2; j--) {
               dp[i] *= j;
           }
       }
       return dp.reduce((sum, val) => sum + val, 0);
   };
   