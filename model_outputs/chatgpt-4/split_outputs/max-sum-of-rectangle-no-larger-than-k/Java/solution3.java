public int maxSumSubmatrix(int[][] matrix, int k) {
    int m = matrix.length, n = matrix[0].length;
    int[][] sums = new int[m + 1][n + 1];
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            sums[i][j] = sums[i - 1][j] + sums[i][j - 1] - sums[i - 1][j - 1] + matrix[i - 1][j - 1];
        }
    }
    int maxSum = Integer.MIN_VALUE;
    for (int row1 = 0; row1 < m; row1++) {
        for (int row2 = row1 + 1; row2 <= m; row2++) {
            for (int col1 = 0; col1 < n; col1++) {
                for (int col2 = col1 + 1; col2 <= n; col2++) {
                    int sum = sums[row2][col2] - sums[row2][col1] - sums[row1][col2] + sums[row1][col1];
                    if (sum <= k) maxSum = Math.max(maxSum, sum);
                }
            }
        }
    }
    return maxSum;
}
