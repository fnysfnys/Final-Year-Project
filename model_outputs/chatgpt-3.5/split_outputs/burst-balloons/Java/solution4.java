public int maxCoins(int[] nums) {
    int n = nums.length;
    int[] paddedNums = new int[n + 2];
    paddedNums[0] = 1;
    paddedNums[n + 1] = 1;
    for (int i = 1; i <= n; i++) {
        paddedNums[i] = nums[i - 1];
    }
    int[][] memo = new int[n + 2][n + 2];
    return burstBalloons(paddedNums, 1, n, memo);
}

private int burstBalloons(int[] nums, int left, int right, int[][] memo) {
    if (left > right) {
        return 0;
    }
    if (memo[left][right] > 0) {
        return memo[left][right];
    }
    int maxCoins = 0;
    for (int i = left; i <= right; i++) {
        int coins = nums[left - 1] * nums[i] * nums[right + 1];
        coins += burstBalloons(nums, left, i - 1, memo) + burstBalloons(nums, i + 1, right, memo);
        maxCoins = Math.max(maxCoins, coins);
    }
    memo[left][right] = maxCoins;
    return maxCoins;
}
