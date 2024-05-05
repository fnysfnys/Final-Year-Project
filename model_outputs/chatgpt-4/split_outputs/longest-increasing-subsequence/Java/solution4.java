public int lengthOfLIS(int[] nums) {
    return lengthOfLIS(nums, Integer.MIN_VALUE, 0, new Integer[nums.length]);
}

private int lengthOfLIS(int[] nums, int prev, int curpos, Integer[] memo) {
    if (curpos == nums.length) {
        return 0;
    }
    if (memo[curpos] != null) {
        return memo[curpos];
    }
    int taken = 0;
    if (nums[curpos] > prev) {
        taken = 1 + lengthOfLIS(nums, nums[curpos], curpos + 1, memo);
    }
    int nottaken = lengthOfLIS(nums, prev, curpos + 1, memo);
    memo[curpos] = Math.max(taken, nottaken);
    return memo[curpos];
}
