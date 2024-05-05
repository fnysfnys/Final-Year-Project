var maxCoins = function(nums) {
    nums = [1, ...nums, 1];
    let n = nums.length;
    let dp = Array.from({ length: n }, () => Array(n).fill(0));

    for (let len = 2; len < n; len++) {
        for (let left = 0; left < n - len; left++) {
            let right = left + len;
            for (let i = left + 1; i < right; i++) {
                dp[left][right] = Math.max(
                    dp[left][right],
                    nums[left] * nums[i] * nums[right] + dp[left][i] + dp[i][right]
                );
            }
        }
    }
    return dp[0][n - 1];
};