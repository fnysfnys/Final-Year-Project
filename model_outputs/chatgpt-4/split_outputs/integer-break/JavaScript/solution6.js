/**
 * Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.
 * Return the maximum product you can get.
 */
var integerBreak = function(n) {
    if (n <= 3) return n - 1;
    const mod = n % 3;
    if (mod === 0) return Math.pow(3, n / 3);
    if (mod === 1) return Math.pow(3, (n - 4) / 3) * 4;
    return Math.pow(3, (n - 2) / 3) * 2;


};
