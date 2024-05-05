public int lengthOfLIS(int[] nums) {
    return lengthOfLIS(nums, 0, nums.length - 1, Integer.MIN_VALUE);
}

private int lengthOfLIS(int[] nums, int start, int end, int prev) {
    if (start > end) {
        return 0;
    }
    int include = 0;
    if (nums[start] > prev) {
        include = 1 + lengthOfLIS(nums, start + 1, end, nums[start]);
    }
    int exclude = lengthOfLIS(nums, start + 1, end, prev);
    return Math.max(include, exclude);
}
