var numberOfArithmeticSlices = function(nums) {
    const n = nums.length;
    const dp = Array(n).fill(0);

    for (let i = 2; i < n; i++) {
        if (nums[i] - nums[i - 1] === nums[i - 1] - nums[i - 2]) {
            dp[i] = dp[i - 1] + 1;
        }
    }

    return dp.reduce((sum, val) => sum + val, 0);
};
