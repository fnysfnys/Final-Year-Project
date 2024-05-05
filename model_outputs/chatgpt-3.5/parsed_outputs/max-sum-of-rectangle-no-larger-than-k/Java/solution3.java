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
                int currentMax = rowSum[0];
                int maxSumEndingHere = rowSum[0];
                for (int i = 1; i < m; i++) {
                    maxSumEndingHere = Math.max(rowSum[i], maxSumEndingHere + rowSum[i]);
                    currentMax = Math.max(currentMax, maxSumEndingHere);
                }
                if (currentMax <= k) {
                    maxSum = Math.max(maxSum, currentMax);
                } else {
                    for (int i = 0; i < m; i++) {
                        currentMax = 0;
                        for (int j = i; j < m; j++) {
                            currentMax += rowSum[j];
                            if (currentMax <= k) {
                                maxSum = Math.max(maxSum, currentMax);
                            }
                        }
                    }
                }
            }
        }
        return maxSum;
    }
}
