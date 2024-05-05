public int maxRotateFunction(int[] nums) {
    int n = nums.length;
    int totalSum = 0;
    int rotationSum = 0;
    for (int i = 0; i < n; i++) {
        totalSum += nums[i];
        rotationSum += i * nums[i];
    }
    int max = rotationSum;
    for (int k = 1; k < n; k++) {
        rotationSum = rotationSum + totalSum - n * nums[n - k];
        max = Math.max(max, rotationSum);
    }
    return max;
}
