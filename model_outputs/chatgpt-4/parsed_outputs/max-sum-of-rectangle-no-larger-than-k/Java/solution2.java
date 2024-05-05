class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        int maxSum = Integer.MIN_VALUE;
        for (int left = 0; left < n; left++) {
            int[] sums = new int[m];
            for (int right = left; right < n; right++) {
                for (int i = 0; i < m; i++) {
                    sums[i] += matrix[i][right];
                }
                maxSum = Math.max(maxSum, findMaxSumCloseToK(sums, k));
            }
        }
        return maxSum;
    }
    
    private int findMaxSumCloseToK(int[] sums, int k) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for (int sum : sums) {
            currSum += sum;
            Integer num = set.ceiling(currSum - k);
            if (num != null) maxSum = Math.max(maxSum, currSum - num);
            set.add(currSum);
        }
        return maxSum;
    }
    
}
