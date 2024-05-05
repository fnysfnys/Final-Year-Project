/**
 * Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.
 */
var countNumbersWithUniqueDigits = function(n) {
    if (n === 0) return 1;
    let dp = new Array(n + 1).fill(0);
    dp[0] = 1;
    dp[1] = 10;

    for (let i = 2; i <= n; i++) {
        dp[i] = 9;
        for (let j = 9; j >= 9 - i + 2; j--) {
            dp[i] *= j;
        }
        dp[i] += dp[i - 1];
    }

    return dp[n];
};