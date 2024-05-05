/**
 * Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.
 */
var countNumbersWithUniqueDigits = function(n) {
    let end = Math.pow(10, n);
    let count = 0;

    for (let i = 0; i < end; i++) {
        if (new Set(i.toString()).size === i.toString().length) count++;
    }

    return count;
};
