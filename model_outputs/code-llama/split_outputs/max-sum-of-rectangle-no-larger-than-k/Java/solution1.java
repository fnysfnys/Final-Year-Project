public int maxSumSubmatrix(int[][] matrix, int k) {
   int m = matrix.length;
   int n = matrix[0].length;
   int maxSum = Integer.MIN_VALUE;

   for (int i = 0; i < m; i++) {
       for (int j = 0; j < n; j++) {
           int sum = 0;
           for (int x = i; x < m; x++) {
               for (int y = j; y < n; y++) {
                   sum += matrix[x][y];
               }
           }
           if (sum <= k) {
               maxSum = Math.max(maxSum, sum);
           }
       }
   }

   return maxSum;
}
