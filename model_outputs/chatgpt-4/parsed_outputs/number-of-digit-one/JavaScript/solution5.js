/**
* Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
*/
var countDigitOne = function(n) {
    let count = 0, factor = 1, r = 1;
    while (n > 0) {
        count += Math.floor(n / 10) * factor;
        if (n % 10 > 1) count += factor;
        if (n % 10 === 1) count += r;
        r += n % 10 * factor;
        factor *= 10;
        n = Math.floor(n / 10);
    }
    return count;
};