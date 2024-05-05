public int maxSumSubmatrix(int[][] matrix, int k) {
    int maxSum = Integer.MIN_VALUE;
    int m = matrix.length;
    int n = matrix[0].length;

    for (int top = 0; top < m; top++) {
        for (int bottom = top; bottom < m; bottom++) {
            for (int left = 0; left < n; left++) {
                for (int right = left; right < n; right++) {
                    int sum = 0;
                    for (int i = top; i <= bottom; i++) {
                        for (int j = left; j <= right; j++) {
                            sum += matrix[i][j];
                        }
                    }
                    if (sum <= k) {
                        maxSum = Math.max(maxSum, sum);
                    }
                }
            }
        }
    }
    return maxSum;
}
