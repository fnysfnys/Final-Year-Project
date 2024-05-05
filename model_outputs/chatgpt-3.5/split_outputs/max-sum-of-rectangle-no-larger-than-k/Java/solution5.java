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
            for (int sum : rowSum) {
                currentSum += sum;
                Integer ceil = set.ceiling(currentSum - k);
                if (ceil != null) {
                    maxSum = Math.max(maxSum, currentSum - ceil);
                }
                set.add(currentSum);
            }
        }
    }
    return maxSum;
}
