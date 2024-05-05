var maxCoins = function(nums) {
    const n = nums.length;
    nums.unshift(1);
    nums.push(1);

    const dp = Array.from({ length: n + 2 }, () => Array(n + 2).fill(0));

    for (let len = 2; len <= n + 1; len++) {
        for (let left = 0; left <= n - len + 1; left++) {
            let right = left + len;
            for (let k = left + 1; k < right; k++) {
                dp[left][right] = Math.max(dp[left][right], nums[left] * nums[k] * nums[right] + dp[left][k] + dp[k][right]);
            }
        }
    }

    return dp[0][n + 1];
};
