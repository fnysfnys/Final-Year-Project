public int maxRotateFunction(int[] nums) {
    int n = nums.length;
    int[] prefixSum = new int[n];
    int totalSum = 0;
    for (int i = 0; i < n; i++) {
        totalSum += nums[i];
        prefixSum[i] = i * nums[i];
    }
    int max = prefixSum[n - 1];
    for (int k = 1; k < n; k++) {
        prefixSum[k] = prefixSum[k - 1] + totalSum - nums[n - k];
        max = Math.max(max, prefixSum[k]);
    }
    return max;
}
