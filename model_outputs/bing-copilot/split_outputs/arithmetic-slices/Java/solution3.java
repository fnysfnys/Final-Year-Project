public int numberOfArithmeticSlices(int[] nums) {
    int n = nums.length;
    int count = 0;
    for (int start = 0; start < n - 2; start++) {
        int diff = nums[start + 1] - nums[start];
        int end = start + 2;
        while (end < n && nums[end] - nums[end - 1] == diff) {
            count++;
            end++;
        }
    }
    return count;
}
