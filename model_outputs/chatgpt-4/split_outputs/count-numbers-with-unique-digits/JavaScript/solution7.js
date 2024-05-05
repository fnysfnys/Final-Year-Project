/**
 * Given an integer n, return the count of all numbers with unique digits, x

, where 0 <= x < 10n.
 */
var countNumbersWithUniqueDigits = function(n) {
    if (n === 0) return 1;
    if (n === 1) return 10;
    let total = 10, perm = 9;

    for (let i = 2; i <= n; i++) {
        perm *= (11 - i);
        total += perm;
    }

    return total;
};
