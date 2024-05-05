/**
 * Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.
 * Return the maximum product you can get.
 */
var integerBreak = function(n, memo = {}) {
    if (n in memo) return memo[n];
    if (n === 2) return 1;

    let maxProduct = 0;
    for (let i = 1; i < n; i++) {
        maxProduct = Math.max(maxProduct, i * (n - i), i * integerBreak(n - i, memo));
    }
    memo[n] = maxProduct;
    return maxProduct;
};