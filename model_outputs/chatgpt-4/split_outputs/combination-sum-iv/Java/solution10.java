public int combinationSum4(int[] nums, int target) {
    return combinationSum4Helper(nums, target, new int[target + 1]);
}

private int combinationSum4Helper(int[] nums, int target, int[] dp) {
    if (target < 0) return 0;
    if (target == 0) return 1;
    if (dp[target] != 0) return dp[target];

    int count = 0;
    for (int num : nums) {
        count += combinationSum4Helper(nums, target - num, dp);
    }
    dp[target] = count;
    return count;
}
