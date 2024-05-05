class Solution {
    public int longestIncreasingPath(int[][] matrix) {
       int[][] dp = new int[matrix.length][matrix[0].length];
       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[i].length; j++) {
               dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + 1;
           }
       }
       return dp[matrix.length - 1][matrix[0].length - 1];
    }
    
}
