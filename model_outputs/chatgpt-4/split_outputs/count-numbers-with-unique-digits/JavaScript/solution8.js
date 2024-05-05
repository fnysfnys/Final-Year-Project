/**
 * Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.
 */
var countNumbersWithUniqueDigits = function(n) {
    if (n === 0) return 1;
    if (n === 1) return 10;
    return 9 * countUnique(9, n - 1) + countNumbersWithUniqueDigits(n - 1);
};

function countUnique(start, left) {
    if (left === 0) return 1;
    return start * countUnique(start - 1, left - 1);
};
