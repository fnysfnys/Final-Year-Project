class Solution {
    public int splitArray(int[] nums, int k) {
        int minSum = Integer.MAX_VALUE;
        splitSum(nums, k, 0, 0, minSum);
        return minSum;
    }
    
    private void splitSum(int[] nums, int k, int index, int sum, int minSum) {
        if (k == 1) {
            minSum = Math.min(minSum, sum + Arrays.stream(nums).skip(index).sum());
            return;
        }
        
        for (int i = index; i < nums.length - k + 1; i++) {
            splitSum(nums, k - 1, i + 1, sum + nums[i], minSum);
        }
    }
}
