/**
 * Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.
 * Return the maximum product you can get.
 */
var integerBreak = function(n) {
    let dp = new Array(n + 1).fill(1);
    for (let i = 2; i <= n; i++) {
        for (let j = 1; j < i; j++) {
            dp[i] = Math.max(dp[i], j * (i - j), j * dp[i - j]);
        }
    }
    return dp[n];
};
