class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int[][] memo = new int[n + 1][k + 1];
        for (int[] arr : memo) {
            Arrays.fill(arr, -1);
        }
        return splitArrayHelper(nums, k, 0, memo);
    }
    
    private int splitArrayHelper(int[] nums, int k, int start, int[][] memo) {
        if (k == 1) {
            return sum(nums, start);
        }
        if (memo[start][k] != -1) {
            return memo[start][k];
        }
        int minLargestSum = Integer.MAX_VALUE;
        for (int end = start + 1; end <= nums.length - k + 1; end++) {
            int currentSum = sum(nums, start, end - 1);
            int nextMinLargestSum = splitArrayHelper(nums, k - 1, end, memo);
            minLargestSum = Math.min(minLargestSum, Math.max(currentSum, nextMinLargestSum));
        }
        memo[start][k] = minLargestSum;
        return minLargestSum;
    }
    
    private int sum(int[] nums, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
