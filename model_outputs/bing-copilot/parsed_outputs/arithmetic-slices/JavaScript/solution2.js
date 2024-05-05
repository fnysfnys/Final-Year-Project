var numberOfArithmeticSlices = function(nums) {
    const n = nums.length;
    const dp = new Array(n).fill(0);
    let count = 0;
    for (let i = 2; i < n; i++) {
        if (nums[i] - nums[i - 1] === nums[i - 1] - nums[i - 2]) {
            dp[i] = dp[i - 1] + 1;
            count += dp[i];
        }
    }
    return count;
};
