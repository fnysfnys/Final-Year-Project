class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
      int maxSum = Integer.MIN_VALUE;
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
          int currentSum = matrix[i][j];
          for (int m = i + 1; m < matrix.length; m++) {
            for (int n = j + 1; n < matrix[0].length; n++) {
              currentSum += matrix[m][n];
              if (currentSum <= k && currentSum > maxSum) {
                maxSum = currentSum;
              }
            }
          }
        }
      }
      return maxSum;
    }
    
}
