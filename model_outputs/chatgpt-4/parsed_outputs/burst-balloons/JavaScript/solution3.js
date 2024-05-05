var maxCoins = function(nums) {
    nums = [1, ...nums, 1];
    let n = nums.length;
    let dp = Array.from({ length: n }, () => Array(n).fill(0));

    for (let len = 1; len <= n - 2; len++) {
        for (let left = 1; left <= n - len - 1; left++) {
            let right = left + len - 1;
            for (let i = left; i <= right; i++) {
                dp[left][right] = Math.max(
                    dp[left][right],
                    nums[left - 1] * nums[i] * nums[right + 1] + dp[left][i - 1] + dp[i + 1][right]
                );
            }
        }
    }
    return dp[1][n - 2];
};