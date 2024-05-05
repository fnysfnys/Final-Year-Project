public int maxRotateFunction(int[] nums) {
    int n = nums.length;
    int[] circularBuffer = new int[n];
    int max = Integer.MIN_VALUE;
    int sum = 0;

    for (int i = 0; i < n; i++) {
        circularBuffer[i] = i * nums[i];
        sum += circularBuffer[i];
    }

    max = Math.max(max, sum);

    for (int k = 1; k < n; k++) {
        int lastElement = circularBuffer[n - 1];
        for (int i = n - 1; i > 0; i--) {
            circularBuffer[i] = circularBuffer[i - 1];
        }
        circularBuffer[0] = lastElement;
        sum = sum - max + circularBuffer[0];
        max = Math.max(max, sum);
    }
    return max;
}
