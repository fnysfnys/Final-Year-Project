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
                TreeSet<Integer> set = new TreeSet<>();
                set.add(0);
                int currentSum = 0;
                int currentMax = Integer.MIN_VALUE;
                for (int sum : rowSum) {
                    currentSum += sum;
                    Integer floor = set.floor(currentSum - k);
                    if (floor != null) {
                        currentMax = Math.max(currentMax, currentSum - floor);
                    }
                    set.add(currentSum);
                }
                maxSum = Math.max(maxSum, currentMax);
            }
        }
        return maxSum;
    }
}
