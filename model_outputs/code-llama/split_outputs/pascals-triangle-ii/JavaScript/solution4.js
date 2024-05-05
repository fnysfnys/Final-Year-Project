function getRow(rowIndex) {
   let dp = [];
   for (let i = 0; i <= rowIndex; i++) {
       dp[i] = [];
       for (let j = 0; j <= i; j++) {
           if (j === 0 || j === i) {
               dp[i][j] = 1;
           } else {
               dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
           }
       }
   }
   return dp[rowIndex];
}
