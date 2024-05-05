public int numberOfArithmeticSlices(int[] nums) {
    int n = nums.length;
    int count = 0;
    for (int i = 0; i < n - 2; i++) {
        int j = i + 1;
        int diff = nums[j] - nums[i];
        for (int k = j + 1; k < n; k++) {
            if (nums[k] - nums[j] == diff) {
                count++;
                j = k;
            }
        }
    }
    return count;
}
