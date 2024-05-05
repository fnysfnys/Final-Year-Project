/**
 * Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.
 * Return the maximum product you can get.
 */
var integerBreak = function(n) {
    switch(n) {
        case 2: return 1;
        case 3: return 2;
        default: {
            let product = 1;
            while (n > 4) {
                product *= 3;
                n -= 3;
            }
            return product * n;
        }
    }
};
