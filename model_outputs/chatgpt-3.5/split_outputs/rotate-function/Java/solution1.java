public int maxRotateFunction(int[] nums) {
    int n = nums.length;
    int max = Integer.MIN_VALUE;
    for (int k = 0; k < n; k++) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i * nums[(i - k + n) % n];
        }
        max = Math.max(max, sum);
    }
    return max;
}
