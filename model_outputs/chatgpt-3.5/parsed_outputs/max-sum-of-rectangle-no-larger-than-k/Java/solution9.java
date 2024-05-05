class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int maxSum = Integer.MIN_VALUE;
        int m = matrix.length;
        int n = matrix[0].length;
    
        int[][] prefixSum = new int[m + 1][n + 1];
    
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefixSum[i][j] = prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }
    
        for (int row1 = 0; row1 < m; row1++) {
            for (int col1 = 0; col1 < n; col1++) {
                for (int row2 = row1 + 1; row2 <= m; row2++) {
                    for (int col2 = col1 + 1; col2 <= n; col2++) {
                        int sum = prefixSum[row2][col2] - prefixSum[row2][col1] - prefixSum[row1][col2] + prefixSum[row1][col1];
                        if (sum <= k) {
                            maxSum = Math.max(maxSum, sum);
                        } else {
                            TreeSet<Integer> set = new TreeSet<>();
                            set.add(0);
                            for (int i = 1; i <= m; i++) {
                                int currentSum = prefixSum[row2][col2] - prefixSum[row2][col1] - prefixSum[row1][col2] + prefixSum[row1][col1];
                                Integer ceil = set.ceiling(currentSum - k);
                                if (ceil != null) {
                                    maxSum = Math.max(maxSum, currentSum - ceil);
                                }
                                set.add(currentSum);
                            }
                        }
                    }
                }
            }
        }
        return maxSum;
    }
}
