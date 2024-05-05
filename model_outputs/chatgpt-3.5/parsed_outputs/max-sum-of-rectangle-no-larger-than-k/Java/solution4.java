class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int maxSum = Integer.MIN_VALUE;
        int m = matrix.length;
        int n = matrix[0].length;
    
        for (int left = 0; left < n; left++) {
            int[] rowSum = new int[m];
            for (int right = left; right < n; right++) {
                for (int i = 0; i < m; i++) {
                    rowSum[i] += matrix[i][right];
                }
                for (int i = 0; i < m; i++) {
                    int sum = 0;
                    for (int j = i; j < m; j++) {
                        sum += rowSum[j];
                        if (sum <= k) {
                            maxSum = Math.max(maxSum, sum);
                        }
                    }
                }
            }
        }
        return maxSum;
    }
}
