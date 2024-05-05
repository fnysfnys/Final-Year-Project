class Solution {
    public int splitArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        
        int minLength = n / k;
        int remaining = n - (minLength * k);
        
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i <= remaining; i++) {
            int maxSum = nums[n - remaining - i - 1];
            for (int j = 0; j < remaining - i; j++) {
                maxSum = Math.max(maxSum, nums[n - k * minLength - remaining + j - 1]);
            }
            minSum = Math.min(minSum, maxSum);
        }
        
        return minSum;
    }
}
