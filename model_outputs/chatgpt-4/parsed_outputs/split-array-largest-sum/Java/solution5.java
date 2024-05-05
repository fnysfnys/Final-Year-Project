class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        int[][] memo = new int[n][k + 1];
        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return splitArrayRecursive(nums, prefixSum, memo, 0, k);
    }
    
    private int splitArrayRecursive(int[] nums, int[] prefixSum, int[][] memo, int start, int k) {
        if (k == 1) {
            return prefixSum[nums.length - 1] - prefixSum[start] + nums[start];
        }
        if (memo[start][k] != -1) {
            return memo[start][k];
        }
        int min = Integer.MAX_VALUE;
        for (int i = start; i < nums.length - k + 1; i++) {
            int firstPart = prefixSum[i] - prefixSum[start] + nums[start];
            int secondPart = splitArrayRecursive(nums, prefixSum, memo, i + 1, k - 1);
            min = Math.min(min, Math.max(firstPart, secondPart));
        }
        memo[start][k] = min;
        return min;
    }
}
