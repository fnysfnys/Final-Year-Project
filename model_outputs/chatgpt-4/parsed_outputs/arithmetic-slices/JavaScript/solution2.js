var numberOfArithmeticSlices = function(nums) {
    let count = 0;
    const dp = new Array(nums.length).fill(0);
    for (let i = 2; i < nums.length; i++) {
        if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
            dp[i] = 1 + dp[i - 1];
            count += dp[i];
        }
    }
    return count;
};