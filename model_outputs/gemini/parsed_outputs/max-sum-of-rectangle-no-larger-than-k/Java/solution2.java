class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
      int maxSum = Integer.MIN_VALUE;
      for (int i = 0; i < matrix.length; i++) {
        int[] colSums = new int[matrix[0].length];
        for (int j = 0; j < matrix[0].length; j++) {
          colSums[j] = matrix[i][j];
          if (i > 0) {
            colSums[j] += colSums[j - 1];
          }
          int currentSum = 0;
          for (int sum : colSums) {
            currentSum = Math.max(sum, currentSum + sum);
            if (currentSum <= k && currentSum > maxSum) {
              maxSum = currentSum;
            }
          }
        }
      }
      return maxSum;
    }
    
}
