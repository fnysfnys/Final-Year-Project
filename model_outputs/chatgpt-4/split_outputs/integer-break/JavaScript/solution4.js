/**
 * Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.
 * Return the maximum product you can get.
 */
var integerBreak = function(n) {
    if (n <= 3) return n - 1;
    let products = [0, 1, 2, 3];
    for (let i = 4; i <= n; i++) {
        products[i] = Math.max(2 * products[i - 2], 3 * products[i - 3]);
    }
    return products[n];
};
