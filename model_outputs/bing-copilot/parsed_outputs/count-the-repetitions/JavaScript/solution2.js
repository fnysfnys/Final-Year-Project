   var getMaxRepetitions = function(s1, n1, s2, n2) {
       const dp = Array(n1 + 1).fill(0);
       let j = 0, count = 0;
       for (let i = 1; i <= n1; i++) {
           for (const char of s1) {
               if (char === s2[j]) {
                   j++;
                   if (j === s2.length) {
                       j = 0;
                       count++;
                   }
               }
           }
           dp[i] = count;
           if (dp[i] === dp[i - 1]) {
               break; // Pattern repeats, exit early
           }
       }
       return Math.floor(dp[n1] / n2);
   };
   