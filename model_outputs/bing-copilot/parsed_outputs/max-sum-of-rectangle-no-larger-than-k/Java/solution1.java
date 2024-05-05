class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int maxSum = Integer.MIN_VALUE;
    
        for (int left = 0; left < n; left++) {
            int[] rowSum = new int[m];
            for (int right = left; right < n; right++) {
                for (int i = 0; i < m; i++) {
                    rowSum[i] += matrix[i][right];
                }
                maxSum = Math.max(maxSum, maxSubarraySum(rowSum, k));
            }
        }
    
        return maxSum;
    }
    
    private int maxSubarraySum(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        TreeSet<Integer> prefixSums = new TreeSet<>();
        prefixSums.add(0);
    
        for (int num : arr) {
            currSum += num;
            Integer prevSum = prefixSums.ceiling(currSum - k);
            if (prevSum != null) {
                maxSum = Math.max(maxSum, currSum - prevSum);
            }
            prefixSums.add(currSum);
        }
    
        return maxSum;
    }
    
}
