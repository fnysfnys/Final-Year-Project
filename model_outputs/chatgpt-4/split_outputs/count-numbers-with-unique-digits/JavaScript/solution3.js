/**
 * Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.
 */
var countNumbersWithUniqueDigits = function(n) {
    if (n === 0) return 1;
    let total = 10, uniqueDigits = 9;

    for (let i = 2; i <= n; i++) {
        uniqueDigits *= (11 - i);
        total += uniqueDigits;
    }

    return total;
};
