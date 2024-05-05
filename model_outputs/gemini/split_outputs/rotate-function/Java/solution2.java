public int maxRotateFunction(int[] nums) {
    int n = nums.length;
    int sum = 0, product = 0;
    for (int i = 0; i < n; i++) {
        sum += nums[i];
        product += i * nums[i];
    }
    int max = product;
    for (int k = 1; k < n; k++) {
        product = product + sum - n * nums[k - 1];
        max = Math.max(max, product);
    }
    return max;
}
