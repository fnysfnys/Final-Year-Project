public int maxSumSubmatrix(int[][] matrix, int k) {
    int maxSum = Integer.MIN_VALUE;
    int m = matrix.length, n = matrix[0].length;
    for (int row1 = 0; row1 < m; row1++) {
        for (int col1 = 0; col1 < n; col1++) {
            for (int row2 = row1; row2 < m; row2++) {
                for (int col2 = col1; col2 < n; col2++) {
                    int sum = 0;
                    for (int i = row1; i <= row2; i++) {
                        for (int j = col1; j <= col2; j++) {
                            sum += matrix[i][j];
                        }
                    }
                    if (sum <= k) maxSum = Math.max(maxSum, sum);
                }
            }
        }
    }
    return maxSum;
}
