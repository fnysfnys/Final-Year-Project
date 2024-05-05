class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int[][] memo = new int[n][k + 1];
        return splitHelper(nums, 0, k, memo);
    }
    
    private int splitHelper(int[] nums, int start, int k, int[][] memo) {
        if (k == 1) {
            return sum(nums, start, nums.length - 1);
        }
        if (memo[start][k] != 0) {
            return memo[start][k];
        }
        int minSum = Integer.MAX_VALUE;
        for (int i = start; i < nums.length - k + 1; i++) {
            int currSum = sum(nums, start, i);
            int nextSum = splitHelper(nums, i + 1, k - 1, memo);
            minSum = Math.min(minSum, Math.max(currSum, nextSum));
        }
        memo[start][k] = minSum;
        return minSum;
    }
    
    private int sum(int[] nums, int start, int end) {
        int total = 0;
        for (int i = start; i <= end; i++) {
            total += nums[i];
        }
        return total;
    }
    
}
