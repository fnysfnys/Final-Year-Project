/**
 * Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.
 * Return the maximum product you can get.
 */
var integerBreak = function(n) {
    const findMaxProduct = (num) => {
        if (num <= 4) return num;
        return 3 * findMaxProduct(num - 3);
    };
    return findMaxProduct(n);
};