/**
 * Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
 */
var countDigitOne = function(n) {
    let dp = new Array(n + 1).fill(0);
    for (let i = 1; i <= n; i++) {
        dp[i] = dp[Math.floor(i / 10)] + (i % 10 === 1 ? 1 : 0);
    }
    return dp.reduce((a, b) => a + b, 0);
};