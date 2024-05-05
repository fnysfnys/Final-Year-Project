class Solution {
    public int maxRotateFunction(int[] nums) {
        return maxRotateFunctionUtil(nums, 0, nums.length - 1);
    }
    
    private int maxRotateFunctionUtil(int[] nums, int left, int right) {
        if (left >= right) {
            return 0;
        }
        int mid = (left + right) / 2;
        int leftMax = maxRotateFunctionUtil(nums, left, mid);
        int rightMax = maxRotateFunctionUtil(nums, mid + 1, right);
        int midMax = 0;
        int sum = 0;
        for (int i = left; i <= mid; i++) {
            sum += nums[i];
        }
        for (int i = mid + 1; i <= right; i++) {
            sum -= nums[i];
            midMax = Math.max(midMax, sum);
        }
        return Math.max(Math.max(leftMax, rightMax), sum + midMax);
    }
    
}
