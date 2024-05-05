public int numberOfArithmeticSlices(int[] nums) {
    int n = nums.length;
    int[] prefixSum = new int[n];
    int count = 0;
    for (int i = 2; i < n; i++) {
        if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
            prefixSum[i] = prefixSum[i - 1] + 1;
            count += prefixSum[i];
        }
    }
    return count;
}
