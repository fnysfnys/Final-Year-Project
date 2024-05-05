class Solution {
    public int splitArray(int[] nums, int k) {
        return splitArrayHelper(nums, k, 0, 0, Integer.MIN_VALUE);
    }
    
    private int splitArrayHelper(int[] nums, int k, int index, int currentSum, int largestSum) {
        if (k == 1) {
            return Math.max(largestSum, currentSum + sum(nums, index, nums.length - 1));
        }
        
        int minLargestSum = Integer.MAX_VALUE;
        for (int i = index; i < nums.length; i++) {
            currentSum += nums[i];
            minLargestSum = Math.min(minLargestSum, splitArrayHelper(nums, k - 1, i + 1, currentSum, Math.max(largestSum, currentSum)));
            currentSum -= nums[i];
        }
        
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
