class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
       int m = matrix.length;
       int n = matrix[0].length;
       int[][] dp = new int[m][n];
    
       for (int i = 0; i < m; i++) {
           for (int j = 0; j < n; j++) {
               dp[i][j] = matrix[i][j] + Math.max(dp[i - 1][j], dp[i][j - 1]);
           }
       }
    
       int maxSum = Integer.MIN_VALUE;
       for (int i = 0; i < m; i++) {
           for (int j = 0; j < n; j++) {
               if (dp[i][j] <= k) {
                   maxSum = Math.max(maxSum, dp[i][j]);
               }
           }
       }
    
       return maxSum;
    }
    
}
