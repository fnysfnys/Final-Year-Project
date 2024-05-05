var maxCoins = function(nums) {
    nums = [1, ...nums, 1];
    let n = nums.length;
    let dp = Array(n).fill(0);

    for (let len = 2; len < n; len++) {
        for (let left = 0; left < n - len; left++) {
            let right = left + len;
            for (let i = left + 1; i < right; i++) {
                dp[i] = Math.max(dp[i], nums[left] * nums[i] * nums[right] + dp[left] + dp[right]);
            }
        }
    }
    return dp[n - 1];
};
