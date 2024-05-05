function maxSumSubmatrix(matrix, k) {
   let maxSum = -Infinity;
   for (let i = 0; i < matrix.length; i++) {
       for (let j = 0; j < matrix[i].length; j++) {
           let sum = 0;
           for (let m = i; m < matrix.length; m++) {
               for (let n = j; n < matrix[m].length; n++) {
                   sum += matrix[m][n];
               }
           }
           if (sum <= k && sum > maxSum) {
               maxSum = sum;
           }
       }
   }
   return maxSum;
}
