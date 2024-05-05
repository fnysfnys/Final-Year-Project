/**
 * @param {number} n
 * @return {number}
 */
var integerBreak = function(n) {
    if (n < 4) return n - 1;
    var res = 1;
    while (n) {
        if (n > 4) {
            res *= 3;
            n -= 3;
        } else if (n <= 4 && n >= 2) {
            res *= n;
            n = 0;
        } else if (n === 1) {
            n = 0;
        }
    }
    return res;
};
