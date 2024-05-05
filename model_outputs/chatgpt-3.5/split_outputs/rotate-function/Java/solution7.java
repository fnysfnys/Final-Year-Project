public int maxRotateFunction(int[] nums) {
    int n = nums.length;
    int sum = 0;
    int max = 0;

    for (int i = 0; i < n; i++) {
        sum += i * nums[i];
        max += nums[i];
    }

    int result = sum;

    for (int k = 1; k < n; k++) {
        sum = sum + max - n * nums[n - k];
        result = Math.max(result, sum);
    }
    return result;
}
