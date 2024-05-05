public int maxSumSubmatrix(int[][] matrix, int k) {
  int maxSum = Integer.MIN_VALUE;
  for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[0].length; j++) {
      for (int m = i; m < matrix.length; m++) {
        for (int n = j; n < matrix[0].length; n++) {
          int sum = 0;
          for (int p = i; p <= m; p++) {
            for (int q = j; q <= n; q++) {
              sum += matrix[p][q];
            }
          }
          if (sum <= k && sum > maxSum) {
            maxSum = sum;
          }
        }
      }
    }
  }
  return maxSum;
}
