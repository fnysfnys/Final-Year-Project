/**
 * Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.
 * Return the maximum product you can get.
 */
var integerBreak = function(n) {
    if (n === 2 || n === 3) return n - 1;
    let product = 1;
    while (n > 4) {
        product <<= 1; // equivalent to multiplying by 2
        n -= 2;
    }
    return product * n;
};