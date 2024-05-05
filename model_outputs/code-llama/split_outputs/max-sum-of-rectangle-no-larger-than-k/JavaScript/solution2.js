function maxSumSubmatrix(matrix, k) {
   let dp = new Array(matrix.length + 1).fill(0).map(() => new Array(matrix[0].length + 1).fill(0));
   for (let i = 1; i <= matrix.length; i++) {
       for (let j = 1; j <= matrix[i].length; j++) {
           dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + matrix[i - 1][j - 1];
       }
   }
   let maxSum = -Infinity;
   for (let i = 1; i <= matrix.length; i++) {
       for (let j = 1; j <= matrix[i].length; j++) {
           let sum = 0;
           for (let m = i; m <= matrix.length; m++) {
               for (let n = j; n <= matrix[m].length; n++) {
                   sum += dp[m][n];
               }
           }
           if (sum <= k && sum > maxSum) {
               maxSum = sum;
           }
       }
   }
   return maxSum;
}
