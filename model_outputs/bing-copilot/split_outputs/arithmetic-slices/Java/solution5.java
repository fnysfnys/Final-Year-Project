public int numberOfArithmeticSlices(int[] nums) {
    int n = nums.length;
    Integer[] memo = new Integer[n];
    return dfs(nums, n - 1, memo);
}

private int dfs(int[] nums, int idx, Integer[] memo) {
    if (idx < 2) {
        return 0;
    }
    if (memo[idx] != null) {
        return memo[idx];
    }
    int count = 0;
    if (nums[idx] - nums[idx - 1] == nums[idx - 1] - nums[idx - 2]) {
        count = 1 + dfs(nums, idx - 1, memo);
    }
    memo[idx] = count;
    return count;
}
